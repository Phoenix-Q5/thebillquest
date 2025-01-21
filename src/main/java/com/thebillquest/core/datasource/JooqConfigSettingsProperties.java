package com.thebillquest.core.datasource;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("billquest.common.jooq.settings")
@Getter
@Setter
public class JooqConfigSettingsProperties {

    private boolean returnRecordToPojo = true;
    private boolean logStatistics = false;

    public boolean isReturnRecordToPojo() {
        return returnRecordToPojo;
    }

    public void setReturnRecordToPojo(boolean returnRecordToPojo) {
        this.returnRecordToPojo = returnRecordToPojo;
    }

    public boolean isLogStatistics() {
        return logStatistics;
    }

    public void setLogStatistics(boolean logStatistics) {
        this.logStatistics = logStatistics;
    }

    @Override
    public String toString(){
        return new ToStringBuilder(this, ToStringStyle.NO_CLASS_NAME_STYLE)
                .append("returnRecordToPojo", returnRecordToPojo)
                .append("logStatistics", logStatistics)
                .toString();
    }
}
