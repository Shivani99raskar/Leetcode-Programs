class Solution {
    public int secondHighest(String s) {
    
        List<Integer>digits=s.chars().filter(Character::isDigit).mapToObj(c->Character.getNumericValue(c)).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        return digits.size()>1?digits.get(1):-1;
    }
}