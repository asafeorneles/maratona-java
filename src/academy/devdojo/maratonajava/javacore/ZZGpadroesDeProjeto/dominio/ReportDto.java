package academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio;

public class ReportDto {
    private Aircraft aircraft;
    private Country country;
    private Currency currency;
    private String personName;


    public static final class ReportDtoBuilder {
        private Aircraft aircraft;
        private Country country;
        private Currency currency;
        private String personName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder Builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraft(Aircraft aircraft) {
            this.aircraft = aircraft;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.personName = this.personName;
            reportDto.country = this.country;
            reportDto.aircraft = this.aircraft;
            reportDto.currency = this.currency;
            return reportDto;
        }
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "aircraft=" + aircraft +
                ", country=" + country +
                ", currency=" + currency +
                ", personName='" + personName + '\'' +
                '}';
    }
}
