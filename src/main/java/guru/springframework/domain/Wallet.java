package guru.springframework.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Wallet {

    @Id
    private String id;
    private Long contents;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getContents() {
        return contents;
    }

    public void setContents(Long contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wallet wallet = (Wallet) o;

        if (id != null ? !id.equals(wallet.id) : wallet.id != null) return false;
        return contents != null ? contents.equals(wallet.contents) : wallet.contents == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (contents != null ? contents.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "id='" + id + '\'' +
                ", contents=" + contents +
                '}';
    }
}
