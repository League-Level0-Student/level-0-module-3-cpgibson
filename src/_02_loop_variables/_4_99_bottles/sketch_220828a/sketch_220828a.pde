for(int i = 99; i>= 0; i--){
if (i==1) {
  System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer. " + i + "Take one down and pass it around, no more bottles of beer on the wall. No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 botles of beer on the wall");
}
if (i==99){
  System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer. Take one down and pass it around, ");
}
 else {
   System.out.println(i + " bottles of beer on the wall. " + i + " bottles of beer on the wall, " + i + " bottles of beer. Take one down and pass it around, ");
 }
}
