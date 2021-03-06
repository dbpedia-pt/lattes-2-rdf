package pt.dbpedia.org.lattes.autorship;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;
import rdf.RDF;
import rdf.RDFKeyStrategy;

@Getter
@Setter
public class ChapterInfo {


  @RDF(property = "http://www.w3.org/2002/07/owl#sameAs", secondary= true, value = false,  print=false, id = true, strategy = RDFKeyStrategy.URL)
  private String id;

  @RDF(property =  "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
  private static final String type = "http://purl.org/ontology/bibo/Chapter";


  @XStreamAsAttribute
  @XStreamAlias("CIDADE-DA-EDITORA")
  private String editorCity;

  @RDF(property = "http://purl.org/dc/terms/publisher")
  @XStreamAsAttribute
  @XStreamAlias("NOME-DA-EDITORA")
  private String editorName;

  @RDF(property = "http://purl.org/ontology/bibo/isbn", value = false, base = "https://isbnsearch.org/isbn/", id = false, strategy = RDFKeyStrategy.URL)
  @XStreamAsAttribute
  @XStreamAlias("ISBN")
  private String isbn;

  @RDF(property = "http://purl.org/ontology/bibo/pageEnd")
  @XStreamAsAttribute
  @XStreamAlias("PAGINA-FINAL")
  private String endPage;

  @RDF(property = "http://purl.org/ontology/bibo/pageStart")
  @XStreamAsAttribute
  @XStreamAlias("PAGINA-INICIAL")
  private String startPage;

  @RDF(property = "http://lattes.cnpq.br/ontology/BookTitle")
  @XStreamAsAttribute
  @XStreamAlias("TITULO-DO-LIVRO")
  private String title;

  @XStreamAsAttribute
  @XStreamAlias("NUMERO-DA-SERIE")
  private String serieNumber;

  @XStreamAsAttribute
  @XStreamAlias("NUMERO-DA-EDICAO-REVISAO")
  private String serieRevisionNumber;

  @XStreamAsAttribute
  @XStreamAlias("NUMERO-DE-VOLUMES")
  private String volumeNumbers;

  @XStreamAsAttribute
  @XStreamAlias("ORGANIZADORES")
  private String organizers;


}
