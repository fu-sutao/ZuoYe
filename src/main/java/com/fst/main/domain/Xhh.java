package com.fst.main.domain;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 
 * @TableName xhh
 */
@Table(name="xhh")
@Data
public class Xhh implements Serializable {
    /**
     * 
     */
    @Id
    private Integer tid;

    /**
     * 
     */
    private String tname;

    /**
     * 
     */
    private String tclass;

    /**
     * 
     */
    private Integer tclassid;

    /**
     * 
     */
    private Integer tage;

    /**
     * 
     */
    private LocalDate tdate;

    /**
     * 
     */
    private String taddress;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Xhh other = (Xhh) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getTname() == null ? other.getTname() == null : this.getTname().equals(other.getTname()))
            && (this.getTclass() == null ? other.getTclass() == null : this.getTclass().equals(other.getTclass()))
            && (this.getTclassid() == null ? other.getTclassid() == null : this.getTclassid().equals(other.getTclassid()))
            && (this.getTage() == null ? other.getTage() == null : this.getTage().equals(other.getTage()))
            && (this.getTdate() == null ? other.getTdate() == null : this.getTdate().equals(other.getTdate()))
            && (this.getTaddress() == null ? other.getTaddress() == null : this.getTaddress().equals(other.getTaddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getTname() == null) ? 0 : getTname().hashCode());
        result = prime * result + ((getTclass() == null) ? 0 : getTclass().hashCode());
        result = prime * result + ((getTclassid() == null) ? 0 : getTclassid().hashCode());
        result = prime * result + ((getTage() == null) ? 0 : getTage().hashCode());
        result = prime * result + ((getTdate() == null) ? 0 : getTdate().hashCode());
        result = prime * result + ((getTaddress() == null) ? 0 : getTaddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tid=").append(tid);
        sb.append(", tname=").append(tname);
        sb.append(", tclass=").append(tclass);
        sb.append(", tclassid=").append(tclassid);
        sb.append(", tage=").append(tage);
        sb.append(", tdate=").append(tdate);
        sb.append(", taddress=").append(taddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}