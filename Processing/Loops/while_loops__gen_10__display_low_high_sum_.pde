int x = 0;
int y;
int sum = 0;
int high = 0;
int low = 101;
while (x < 10) {
  y = int(random(100));
  print(y + " ");
  sum = sum + y;
  x = x + 1;
  
  if(y > high){
  high = y; 
  }
  
  if(y < low){
    low = y;
  }
}
print("High: " + high + " " + "Low: " + low + " Sum: " + sum);
