class ThroneInheritance {
    private String king;
    
    private Map<String, List<String>> familyTree;
    
    private Set<String> deadMembers;

    public ThroneInheritance(String kingName) {
        this.king = kingName;
        this.familyTree = new HashMap<>();
        this.deadMembers = new HashSet<>();
        
        familyTree.put(kingName, new ArrayList<>());
    }
    
    public void birth(String parentName, String childName) {
        familyTree.get(parentName).add(childName);
        
        familyTree.put(childName, new ArrayList<>());
    }
    
    public void death(String name) {
        deadMembers.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> order = new ArrayList<>();
        
        traverse(king, order);
        
        return order;
    }
    
    private void traverse(String currentPerson, List<String> order) {
        if (!deadMembers.contains(currentPerson)) {
            order.add(currentPerson);
        }
        
        List<String> children = familyTree.get(currentPerson);
        for (String child : children) {
            traverse(child, order);
        }
    }
}