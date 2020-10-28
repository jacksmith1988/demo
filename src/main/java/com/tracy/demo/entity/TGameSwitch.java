package com.tracy.demo.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TGameSwitch entity. @author MyEclipse Persistence Tools
 * GAME_SEQ
 */
@Entity
@Table(name = "T_GAME_SWITCH")
//@SequenceGenerator(sequenceName="GAME_SEQ", name = "GAME_SEQ",allocationSize=1)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region="sysDataCache") 
@Cacheable(true)
public class TGameSwitch implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String productId;
	private String gameId;
	private String gameName;
	private String flag;
	private Timestamp createDate;
	private String createDateBy;
	private Timestamp lastUpdate;
	private String lastUpdateBy;
	private String gameCode;
	private String gameDisplayName;
	private String category;
	private String icon;
	private String line;
	private String hd;
	private String girl;
	private String anime;
	private String movie;
	private String other;
	private String progressive;

	// Constructors

	/** default constructor */
	public TGameSwitch() {
	}

	/** minimal constructor */
	public TGameSwitch(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public TGameSwitch(BigDecimal id, String productId, String gameId,
			String gameName, String flag, Timestamp createDate,
			String createDateBy, Timestamp lastUpdate, String lastUpdateBy,
			String gameCode, String gameDisplayName) {
		this.id = id;
		this.productId = productId;
		this.gameId = gameId;
		this.gameName = gameName;
		this.flag = flag;
		this.createDate = createDate;
		this.createDateBy = createDateBy;
		this.lastUpdate = lastUpdate;
		this.lastUpdateBy = lastUpdateBy;
		this.gameCode = gameCode;
		this.gameDisplayName = gameDisplayName;
	}

	// Property accessors
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="GAME_SEQ")
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "PRODUCT_ID", length = 20)
	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Column(name = "GAME_ID", length = 20)
	public String getGameId() {
		return this.gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	@Column(name = "GAME_NAME", length = 200)
	public String getGameName() {
		return this.gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	@Column(name = "FLAG", length = 1)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "CREATE_DATE", length = 7)
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	@Column(name = "CREATE_DATE_BY", length = 50)
	public String getCreateDateBy() {
		return this.createDateBy;
	}

	public void setCreateDateBy(String createDateBy) {
		this.createDateBy = createDateBy;
	}

	@Column(name = "LAST_UPDATE", length = 7)
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "LAST_UPDATE_BY", length = 50)
	public String getLastUpdateBy() {
		return this.lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	@Column(name = "GAME_CODE", length = 20)
	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	@Column(name = "GAME_DISPLAY_NAME", length = 30)
	public String getGameDisplayName() {
		return this.gameDisplayName;
	}

	public void setGameDisplayName(String gameDisplayName) {
		this.gameDisplayName = gameDisplayName;
	}

	@Column(name = "CATEGORY", length = 200)
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "ICON", length = 200)
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	@Column(name = "HD", length = 200)
	public String getHd() {
		return hd;
	}

	public void setHd(String hd) {
		this.hd = hd;
	}
	@Column(name = "GIRL", length = 200)
	public String getGirl() {
		return girl;
	}

	public void setGirl(String girl) {
		this.girl = girl;
	}
	@Column(name = "ANIME", length = 200)
	public String getAnime() {
		return anime;
	}

	public void setAnime(String anime) {
		this.anime = anime;
	}
	@Column(name = "MOVIE", length = 200)
	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}
	@Column(name = "OTHER", length = 200)
	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}
	@Column(name = "PROGRESSIVE", length = 200)
	public String getProgressive() {
		return progressive;
	}

	public void setProgressive(String progressive) {
		this.progressive = progressive;
	}
	@Column(name = "LINE", length = 200)
	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}
	

}