package baitapvenha;

import java.util.ArrayList;
import java.util.List;

public class ManagerCandidate {
   List<Candidate> candidate;
   
   public ManagerCandidate() {
	   this.candidate = new ArrayList<>();
   }
   
   public void add(Candidate candidate) {
       this.candidate.add(candidate);
   }

   public void showInfor() {
       this.candidate.forEach(candidate -> System.out.println(candidate.toString()));
   }

   public Candidate searchById(String id) {
       return this.candidate.stream()
		          .filter(candidate -> candidate.getId().equals(id))
		          .findFirst().orElse(null);
   }

}
