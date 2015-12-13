import java.io.*;
import java.util.*;

public class RolePlay{
	private ArrayList<Edge> rolesInScenes = new ArrayList<>();
	private int roles;
	private int actors;
	private int scenes;

	public RolePlay(){

	}

	public void printShow(){
		System.out.print(roles+" ");
		System.out.print(scenes+" ");
		System.out.print(actors);
		System.out.println();
		for(int i = 0; i < roles; i++){
			System.out.print(actors+" ");	
			for(int j = 1; j <= actors; j++){
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		for (Edge e:rolesInScenes) {
			System.out.println("2 "+ e.getStart() +" " + e.getEnd());
			
		}
	}
	public void addScene(Edge e){
		rolesInScenes.add(e);
	}

	public void setRoles(int roles){
		this.roles = roles;
	}
	public void setActors(int actors){
		this.actors = actors;
	}
	public void setScenes(int scenes){
		this.scenes = scenes;
	}

}
