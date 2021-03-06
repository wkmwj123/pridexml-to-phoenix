package org.ncpsb.phoenixcluster.pridexmltophoenix.model;

/**
 * Created by baimi on 2017/11/10.
 * This class stores the peptide object in PRIDEXML controller)
 */
public class PSMRow {
    String spectrumTitle;
    String peptideSequence;
    String modifications;

    public String getModifications() {
        return modifications;
    }

    public void setModifications(String modifications) {
        this.modifications = modifications;
    }

    public String getSpectrumTitle() {
        return spectrumTitle;
    }

    public void setSpectrumTitle(String spectrumTitle) {
        this.spectrumTitle = spectrumTitle;
    }

    public String getPeptideSequence() {
        return peptideSequence;
    }

    public void setPeptideSequence(String peptideSequence) {
        this.peptideSequence = peptideSequence;
    }
}
