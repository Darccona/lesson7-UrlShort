package shorts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

class NewUrl {
    private String Url;

    public NewUrl(String Url) {
        this.Url = Url;
    }

    public String getUrl() {
        return Url;
    }
    public void setUrl(String name) {
        this.Url = Url;
    }
}

@Entity
public class TableStorage {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;

    protected TableStorage() {}

    public TableStorage(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s']", id, firstName);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
}
