class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder sb1=new StringBuilder(str1).append(str2);
        StringBuilder sb2=new StringBuilder(str2).append(str1);

if(!sb1.toString().equals(sb2.toString())){
    return "";
}
int gcdLen=gcgLength(str1.length(),str2.length());
StringBuilder result=new StringBuilder(str1.substring(0,gcdLen));
return result.toString();
    }
private static int gcgLength(int l1,int l2)
{
while(l2!=0){
    int temp=l2;
    l2=l1%l2;
    l1=temp;
}
return l1;
}
    
}