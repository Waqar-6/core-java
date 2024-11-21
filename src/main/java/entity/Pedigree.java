package entity;

public class Pedigree {
    private long dogId;
    private long fatherId;
    private long motherId;

    public Pedigree(long dogId, long fatherId, long motherId) {
        this.dogId = dogId;
        this.fatherId = fatherId;
        this.motherId = motherId;
    }

    public Pedigree () {}

    public long getDogId() {return dogId;}

    public void setDogId(long dogId) {this.dogId = dogId;}

    public long getFatherId() {return fatherId;}

    public void setFatherId(long fatherId) {this.fatherId = fatherId;}

    public long getMotherId() {return motherId;}

    public void setMotherId(long motherId) {this.motherId = motherId;}
}