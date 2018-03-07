public class Artiste {
     
    private String name;
     
    private List<Artiste> shortestPath = new LinkedList<>();
     
    private Integer distance = Integer.MAX_VALUE;
     
    Map<Artiste, Integer> adjacentArtistes = new HashMap<>();
    
    public Artiste[] getRelatedArtist (){
		// STP COCO REMPLI LA
	}
 
    public void addDestination(Artiste destination, int distance) {
        adjacentNodes.put(destination, distance);
    }
  
    public Artiste(String name) {
        this.name = name;
    }
     
    // getters and setters
}
