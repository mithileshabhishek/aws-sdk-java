/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Available option.
 * </p>
 */
public class OptionGroupOption implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the option.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the option.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the engine that this option can be applied to.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * Indicates the major engine version that the option is available for.
     * </p>
     */
    private String majorEngineVersion;
    /**
     * <p>
     * The minimum required engine version for the option to be applied.
     * </p>
     */
    private String minimumRequiredMinorEngineVersion;
    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     */
    private Boolean portRequired;
    /**
     * <p>
     * If the option requires a port, specifies the default port for the option.
     * </p>
     */
    private Integer defaultPort;
    /**
     * <p>
     * List of all options that are prerequisites for this option.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> optionsDependedOn;
    /**
     * <p>
     * A persistent option cannot be removed from the option group once the
     * option group is used, but this option can be removed from the db instance
     * while modifying the related data and assigning another option group
     * without this option.
     * </p>
     */
    private Boolean persistent;
    /**
     * <p>
     * A permanent option cannot be removed from the option group once the
     * option group is used, and it cannot be removed from the db instance after
     * assigning an option group with this permanent option.
     * </p>
     */
    private Boolean permanent;
    /**
     * <p>
     * Specifies the option settings that are available (and the default value)
     * for each option in an option group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OptionGroupOptionSetting> optionGroupOptionSettings;

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @param name
     *        The name of the option.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @return The name of the option.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @param name
     *        The name of the option.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OptionGroupOption withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     * 
     * @param description
     *        The description of the option.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     * 
     * @return The description of the option.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     * 
     * @param description
     *        The description of the option.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OptionGroupOption withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the engine that this option can be applied to.
     * </p>
     * 
     * @param engineName
     *        The name of the engine that this option can be applied to.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The name of the engine that this option can be applied to.
     * </p>
     * 
     * @return The name of the engine that this option can be applied to.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * The name of the engine that this option can be applied to.
     * </p>
     * 
     * @param engineName
     *        The name of the engine that this option can be applied to.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OptionGroupOption withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * Indicates the major engine version that the option is available for.
     * </p>
     * 
     * @param majorEngineVersion
     *        Indicates the major engine version that the option is available
     *        for.
     */

    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }

    /**
     * <p>
     * Indicates the major engine version that the option is available for.
     * </p>
     * 
     * @return Indicates the major engine version that the option is available
     *         for.
     */

    public String getMajorEngineVersion() {
        return this.majorEngineVersion;
    }

    /**
     * <p>
     * Indicates the major engine version that the option is available for.
     * </p>
     * 
     * @param majorEngineVersion
     *        Indicates the major engine version that the option is available
     *        for.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OptionGroupOption withMajorEngineVersion(String majorEngineVersion) {
        setMajorEngineVersion(majorEngineVersion);
        return this;
    }

    /**
     * <p>
     * The minimum required engine version for the option to be applied.
     * </p>
     * 
     * @param minimumRequiredMinorEngineVersion
     *        The minimum required engine version for the option to be applied.
     */

    public void setMinimumRequiredMinorEngineVersion(
            String minimumRequiredMinorEngineVersion) {
        this.minimumRequiredMinorEngineVersion = minimumRequiredMinorEngineVersion;
    }

    /**
     * <p>
     * The minimum required engine version for the option to be applied.
     * </p>
     * 
     * @return The minimum required engine version for the option to be applied.
     */

    public String getMinimumRequiredMinorEngineVersion() {
        return this.minimumRequiredMinorEngineVersion;
    }

    /**
     * <p>
     * The minimum required engine version for the option to be applied.
     * </p>
     * 
     * @param minimumRequiredMinorEngineVersion
     *        The minimum required engine version for the option to be applied.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OptionGroupOption withMinimumRequiredMinorEngineVersion(
            String minimumRequiredMinorEngineVersion) {
        setMinimumRequiredMinorEngineVersion(minimumRequiredMinorEngineVersion);
        return this;
    }

    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     * 
     * @param portRequired
     *        Specifies whether the option requires a port.
     */

    public void setPortRequired(Boolean portRequired) {
        this.portRequired = portRequired;
    }

    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     * 
     * @return Specifies whether the option requires a port.
     */

    public Boolean getPortRequired() {
        return this.portRequired;
    }

    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     * 
     * @param portRequired
     *        Specifies whether the option requires a port.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OptionGroupOption withPortRequired(Boolean portRequired) {
        setPortRequired(portRequired);
        return this;
    }

    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     * 
     * @return Specifies whether the option requires a port.
     */

    public Boolean isPortRequired() {
        return this.portRequired;
    }

    /**
     * <p>
     * If the option requires a port, specifies the default port for the option.
     * </p>
     * 
     * @param defaultPort
     *        If the option requires a port, specifies the default port for the
     *        option.
     */

    public void setDefaultPort(Integer defaultPort) {
        this.defaultPort = defaultPort;
    }

    /**
     * <p>
     * If the option requires a port, specifies the default port for the option.
     * </p>
     * 
     * @return If the option requires a port, specifies the default port for the
     *         option.
     */

    public Integer getDefaultPort() {
        return this.defaultPort;
    }

    /**
     * <p>
     * If the option requires a port, specifies the default port for the option.
     * </p>
     * 
     * @param defaultPort
     *        If the option requires a port, specifies the default port for the
     *        option.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OptionGroupOption withDefaultPort(Integer defaultPort) {
        setDefaultPort(defaultPort);
        return this;
    }

    /**
     * <p>
     * List of all options that are prerequisites for this option.
     * </p>
     * 
     * @return List of all options that are prerequisites for this option.
     */

    public java.util.List<String> getOptionsDependedOn() {
        if (optionsDependedOn == null) {
            optionsDependedOn = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return optionsDependedOn;
    }

    /**
     * <p>
     * List of all options that are prerequisites for this option.
     * </p>
     * 
     * @param optionsDependedOn
     *        List of all options that are prerequisites for this option.
     */

    public void setOptionsDependedOn(
            java.util.Collection<String> optionsDependedOn) {
        if (optionsDependedOn == null) {
            this.optionsDependedOn = null;
            return;
        }

        this.optionsDependedOn = new com.amazonaws.internal.SdkInternalList<String>(
                optionsDependedOn);
    }

    /**
     * <p>
     * List of all options that are prerequisites for this option.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setOptionsDependedOn(java.util.Collection)} or
     * {@link #withOptionsDependedOn(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param optionsDependedOn
     *        List of all options that are prerequisites for this option.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OptionGroupOption withOptionsDependedOn(String... optionsDependedOn) {
        if (this.optionsDependedOn == null) {
            setOptionsDependedOn(new com.amazonaws.internal.SdkInternalList<String>(
                    optionsDependedOn.length));
        }
        for (String ele : optionsDependedOn) {
            this.optionsDependedOn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of all options that are prerequisites for this option.
     * </p>
     * 
     * @param optionsDependedOn
     *        List of all options that are prerequisites for this option.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OptionGroupOption withOptionsDependedOn(
            java.util.Collection<String> optionsDependedOn) {
        setOptionsDependedOn(optionsDependedOn);
        return this;
    }

    /**
     * <p>
     * A persistent option cannot be removed from the option group once the
     * option group is used, but this option can be removed from the db instance
     * while modifying the related data and assigning another option group
     * without this option.
     * </p>
     * 
     * @param persistent
     *        A persistent option cannot be removed from the option group once
     *        the option group is used, but this option can be removed from the
     *        db instance while modifying the related data and assigning another
     *        option group without this option.
     */

    public void setPersistent(Boolean persistent) {
        this.persistent = persistent;
    }

    /**
     * <p>
     * A persistent option cannot be removed from the option group once the
     * option group is used, but this option can be removed from the db instance
     * while modifying the related data and assigning another option group
     * without this option.
     * </p>
     * 
     * @return A persistent option cannot be removed from the option group once
     *         the option group is used, but this option can be removed from the
     *         db instance while modifying the related data and assigning
     *         another option group without this option.
     */

    public Boolean getPersistent() {
        return this.persistent;
    }

    /**
     * <p>
     * A persistent option cannot be removed from the option group once the
     * option group is used, but this option can be removed from the db instance
     * while modifying the related data and assigning another option group
     * without this option.
     * </p>
     * 
     * @param persistent
     *        A persistent option cannot be removed from the option group once
     *        the option group is used, but this option can be removed from the
     *        db instance while modifying the related data and assigning another
     *        option group without this option.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OptionGroupOption withPersistent(Boolean persistent) {
        setPersistent(persistent);
        return this;
    }

    /**
     * <p>
     * A persistent option cannot be removed from the option group once the
     * option group is used, but this option can be removed from the db instance
     * while modifying the related data and assigning another option group
     * without this option.
     * </p>
     * 
     * @return A persistent option cannot be removed from the option group once
     *         the option group is used, but this option can be removed from the
     *         db instance while modifying the related data and assigning
     *         another option group without this option.
     */

    public Boolean isPersistent() {
        return this.persistent;
    }

    /**
     * <p>
     * A permanent option cannot be removed from the option group once the
     * option group is used, and it cannot be removed from the db instance after
     * assigning an option group with this permanent option.
     * </p>
     * 
     * @param permanent
     *        A permanent option cannot be removed from the option group once
     *        the option group is used, and it cannot be removed from the db
     *        instance after assigning an option group with this permanent
     *        option.
     */

    public void setPermanent(Boolean permanent) {
        this.permanent = permanent;
    }

    /**
     * <p>
     * A permanent option cannot be removed from the option group once the
     * option group is used, and it cannot be removed from the db instance after
     * assigning an option group with this permanent option.
     * </p>
     * 
     * @return A permanent option cannot be removed from the option group once
     *         the option group is used, and it cannot be removed from the db
     *         instance after assigning an option group with this permanent
     *         option.
     */

    public Boolean getPermanent() {
        return this.permanent;
    }

    /**
     * <p>
     * A permanent option cannot be removed from the option group once the
     * option group is used, and it cannot be removed from the db instance after
     * assigning an option group with this permanent option.
     * </p>
     * 
     * @param permanent
     *        A permanent option cannot be removed from the option group once
     *        the option group is used, and it cannot be removed from the db
     *        instance after assigning an option group with this permanent
     *        option.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OptionGroupOption withPermanent(Boolean permanent) {
        setPermanent(permanent);
        return this;
    }

    /**
     * <p>
     * A permanent option cannot be removed from the option group once the
     * option group is used, and it cannot be removed from the db instance after
     * assigning an option group with this permanent option.
     * </p>
     * 
     * @return A permanent option cannot be removed from the option group once
     *         the option group is used, and it cannot be removed from the db
     *         instance after assigning an option group with this permanent
     *         option.
     */

    public Boolean isPermanent() {
        return this.permanent;
    }

    /**
     * <p>
     * Specifies the option settings that are available (and the default value)
     * for each option in an option group.
     * </p>
     * 
     * @return Specifies the option settings that are available (and the default
     *         value) for each option in an option group.
     */

    public java.util.List<OptionGroupOptionSetting> getOptionGroupOptionSettings() {
        if (optionGroupOptionSettings == null) {
            optionGroupOptionSettings = new com.amazonaws.internal.SdkInternalList<OptionGroupOptionSetting>();
        }
        return optionGroupOptionSettings;
    }

    /**
     * <p>
     * Specifies the option settings that are available (and the default value)
     * for each option in an option group.
     * </p>
     * 
     * @param optionGroupOptionSettings
     *        Specifies the option settings that are available (and the default
     *        value) for each option in an option group.
     */

    public void setOptionGroupOptionSettings(
            java.util.Collection<OptionGroupOptionSetting> optionGroupOptionSettings) {
        if (optionGroupOptionSettings == null) {
            this.optionGroupOptionSettings = null;
            return;
        }

        this.optionGroupOptionSettings = new com.amazonaws.internal.SdkInternalList<OptionGroupOptionSetting>(
                optionGroupOptionSettings);
    }

    /**
     * <p>
     * Specifies the option settings that are available (and the default value)
     * for each option in an option group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setOptionGroupOptionSettings(java.util.Collection)} or
     * {@link #withOptionGroupOptionSettings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param optionGroupOptionSettings
     *        Specifies the option settings that are available (and the default
     *        value) for each option in an option group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OptionGroupOption withOptionGroupOptionSettings(
            OptionGroupOptionSetting... optionGroupOptionSettings) {
        if (this.optionGroupOptionSettings == null) {
            setOptionGroupOptionSettings(new com.amazonaws.internal.SdkInternalList<OptionGroupOptionSetting>(
                    optionGroupOptionSettings.length));
        }
        for (OptionGroupOptionSetting ele : optionGroupOptionSettings) {
            this.optionGroupOptionSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the option settings that are available (and the default value)
     * for each option in an option group.
     * </p>
     * 
     * @param optionGroupOptionSettings
     *        Specifies the option settings that are available (and the default
     *        value) for each option in an option group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public OptionGroupOption withOptionGroupOptionSettings(
            java.util.Collection<OptionGroupOptionSetting> optionGroupOptionSettings) {
        setOptionGroupOptionSettings(optionGroupOptionSettings);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEngineName() != null)
            sb.append("EngineName: " + getEngineName() + ",");
        if (getMajorEngineVersion() != null)
            sb.append("MajorEngineVersion: " + getMajorEngineVersion() + ",");
        if (getMinimumRequiredMinorEngineVersion() != null)
            sb.append("MinimumRequiredMinorEngineVersion: "
                    + getMinimumRequiredMinorEngineVersion() + ",");
        if (getPortRequired() != null)
            sb.append("PortRequired: " + getPortRequired() + ",");
        if (getDefaultPort() != null)
            sb.append("DefaultPort: " + getDefaultPort() + ",");
        if (getOptionsDependedOn() != null)
            sb.append("OptionsDependedOn: " + getOptionsDependedOn() + ",");
        if (getPersistent() != null)
            sb.append("Persistent: " + getPersistent() + ",");
        if (getPermanent() != null)
            sb.append("Permanent: " + getPermanent() + ",");
        if (getOptionGroupOptionSettings() != null)
            sb.append("OptionGroupOptionSettings: "
                    + getOptionGroupOptionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionGroupOption == false)
            return false;
        OptionGroupOption other = (OptionGroupOption) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null
                && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getMajorEngineVersion() == null
                ^ this.getMajorEngineVersion() == null)
            return false;
        if (other.getMajorEngineVersion() != null
                && other.getMajorEngineVersion().equals(
                        this.getMajorEngineVersion()) == false)
            return false;
        if (other.getMinimumRequiredMinorEngineVersion() == null
                ^ this.getMinimumRequiredMinorEngineVersion() == null)
            return false;
        if (other.getMinimumRequiredMinorEngineVersion() != null
                && other.getMinimumRequiredMinorEngineVersion().equals(
                        this.getMinimumRequiredMinorEngineVersion()) == false)
            return false;
        if (other.getPortRequired() == null ^ this.getPortRequired() == null)
            return false;
        if (other.getPortRequired() != null
                && other.getPortRequired().equals(this.getPortRequired()) == false)
            return false;
        if (other.getDefaultPort() == null ^ this.getDefaultPort() == null)
            return false;
        if (other.getDefaultPort() != null
                && other.getDefaultPort().equals(this.getDefaultPort()) == false)
            return false;
        if (other.getOptionsDependedOn() == null
                ^ this.getOptionsDependedOn() == null)
            return false;
        if (other.getOptionsDependedOn() != null
                && other.getOptionsDependedOn().equals(
                        this.getOptionsDependedOn()) == false)
            return false;
        if (other.getPersistent() == null ^ this.getPersistent() == null)
            return false;
        if (other.getPersistent() != null
                && other.getPersistent().equals(this.getPersistent()) == false)
            return false;
        if (other.getPermanent() == null ^ this.getPermanent() == null)
            return false;
        if (other.getPermanent() != null
                && other.getPermanent().equals(this.getPermanent()) == false)
            return false;
        if (other.getOptionGroupOptionSettings() == null
                ^ this.getOptionGroupOptionSettings() == null)
            return false;
        if (other.getOptionGroupOptionSettings() != null
                && other.getOptionGroupOptionSettings().equals(
                        this.getOptionGroupOptionSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime
                * hashCode
                + ((getMajorEngineVersion() == null) ? 0
                        : getMajorEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinimumRequiredMinorEngineVersion() == null) ? 0
                        : getMinimumRequiredMinorEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getPortRequired() == null) ? 0 : getPortRequired()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultPort() == null) ? 0 : getDefaultPort().hashCode());
        hashCode = prime
                * hashCode
                + ((getOptionsDependedOn() == null) ? 0
                        : getOptionsDependedOn().hashCode());
        hashCode = prime * hashCode
                + ((getPersistent() == null) ? 0 : getPersistent().hashCode());
        hashCode = prime * hashCode
                + ((getPermanent() == null) ? 0 : getPermanent().hashCode());
        hashCode = prime
                * hashCode
                + ((getOptionGroupOptionSettings() == null) ? 0
                        : getOptionGroupOptionSettings().hashCode());
        return hashCode;
    }

    @Override
    public OptionGroupOption clone() {
        try {
            return (OptionGroupOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
