import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity // 해당 클래스가 JPA 엔티티임을 나타냅니다.
@Table(name = "members") // 매핑될 데이터베이스 테이블 이름을 지정합니다 (선택 사항).
public class Member {

    @Id // 기본 키(Primary Key) 필드임을 나타냅니다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본 키 생성 전략을 지정합니다.
    private Long id; // 일반적으로 Long 타입의 ID를 사용합니다.

    private String title;
    private String author;
    private int price;
    private int stockQuantity;
    private string isbn;


    public Book() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}

