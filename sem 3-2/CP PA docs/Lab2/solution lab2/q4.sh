# -i for not making it case sensitive
# -E for extended regex
# > for cat operation in other file
#-n for line numbers
cd /run/media/sahil/Sahil\'s\ Gallery/Documents/Dropbox/Academics/sem\ 3-2/CP\ PA\ docs/Lab2/Memory
cat -n HD/file2.txt | grep -iE  "a\|an" > HD/file3.txt

