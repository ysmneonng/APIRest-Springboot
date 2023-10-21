package co.yasmineoenning.APIRestSpringboot.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gerado automaticamente
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL) //relacionamento muito forte
    private Account account;
    @OneToOne(cascade = CascadeType.ALL)
    private Card card;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER) //tpda vez que eu buscar usu no banco, qro listsa de features dele
    private List<Feature> features;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
