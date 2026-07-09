// Last updated: 7/9/2026, 3:08:42 PM
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
    
    StringBuilder sb = new StringBuilder();
    
    while(num != 0) {
        
        int hexDigit = num & 0xF;
        
        if (hexDigit < 10) 
            sb.append(hexDigit);
        else 
            sb.append((char)('a' + hexDigit - 10));
        
        num = num >>> 4; 
    }   
    
    return sb.reverse().toString(); 
    }
}
