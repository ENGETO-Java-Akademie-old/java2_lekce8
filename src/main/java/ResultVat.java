import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

public class ResultVat {

    @JsonProperty("ctr_name")
    private String countryName;
    private BigDecimal highRate;
    private BigDecimal lowRate;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public BigDecimal getHighRate() {
        return highRate;
    }

    public void setHighRate(BigDecimal highRate) {
        this.highRate = highRate;
    }

    public BigDecimal getLowRate() {
        return lowRate;
    }

    public void setLowRate(BigDecimal lowRate) {
        this.lowRate = lowRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultVat resultVat = (ResultVat) o;
        return Objects.equals(countryName, resultVat.countryName) &&
                Objects.equals(highRate, resultVat.highRate) &&
                Objects.equals(lowRate, resultVat.lowRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, highRate, lowRate);
    }
}
