package entity;

public class Pedigree {
    private Long dogId;
    private Long fatherId;
    private Long motherId;

    public Pedigree(long dogId, long fatherId, long motherId) {
        this.dogId = dogId;
        this.fatherId = fatherId;
        this.motherId = motherId;
    }

    public Pedigree () {}

    public Long getDogId() {return dogId;}

    public void setDogId(Long dogId) {this.dogId = dogId;}

    public Long getFatherId() {return fatherId;}

    public void setFatherId(Long fatherId) {this.fatherId = fatherId;}

    public Long getMotherId() {return motherId;}

    public void setMotherId(Long motherId) {this.motherId = motherId;}
}