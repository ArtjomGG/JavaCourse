package lesson9.lesson9Builder;

public class Builder { // kontejner v kotor slozhen6 vse detali
    private Body bodyForVessel;
    private Missile missileForVessel;
    private Engine engineForVessel;

    public Builder addBody(Body bodyFromSupply) { //polochki s komponentami
        bodyForVessel = bodyFromSupply;
        return this;
    }

    public Builder addMissile (Missile missileFromSupply) { //polochki s komponentami
        missileForVessel = missileFromSupply;
        return this;
    }

    public Builder addEngine (Engine engineFromSupply) { //polochki s komponentami
        engineForVessel = engineFromSupply;
        return this;
    }

    public Vessel build() { // sobrali lodku s kompanentami
        return new Vessel(bodyForVessel,engineForVessel,missileForVessel);
    }

}
