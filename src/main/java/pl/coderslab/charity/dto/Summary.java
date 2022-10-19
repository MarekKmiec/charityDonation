package pl.coderslab.charity.dto;

public class Summary {
    private int sumQuantity = 0;
    private int sumDonation = 0;

    public int getSumQuantity() {
        return sumQuantity;
    }

    public void setSumQuantity(int sumQuantity) {
        this.sumQuantity = sumQuantity;
    }

    public int getSumDonation() {
        return sumDonation;
    }

    public void setSumDonation(int sumDonation) {
        this.sumDonation = sumDonation;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "sumQuantity=" + sumQuantity +
                ", sumDonation=" + sumDonation +
                '}';
    }
}
