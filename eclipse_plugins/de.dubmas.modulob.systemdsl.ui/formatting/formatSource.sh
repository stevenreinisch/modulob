#! /bin/sh

touch files.txt
find . -name "*.[hm]" > files.txt

while read line; do
    ./uncrustify_osx -l OC -c ./uncrustify_obj_c.cfg --no-backup $line
done < files.txt

rm files.txt
