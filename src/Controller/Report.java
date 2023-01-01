import java.util.Date;

public class Report {
    private Company company;
    private Date startPeriod;
    private Date endPeriod;
    public Report(Company company, Date start, Date end){
        setCompany(company);
        setStartPeriod(start);
        setEndPeriod(end);

    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Date getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(Date startPeriod) {
        this.startPeriod = startPeriod;
    }

    public Date getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(Date endPeriod) {
        this.endPeriod = endPeriod;
    }
}
