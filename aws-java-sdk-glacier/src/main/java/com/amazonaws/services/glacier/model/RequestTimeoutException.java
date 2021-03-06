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

package com.amazonaws.services.glacier.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Returned if, when uploading an archive, Amazon Glacier times out while
 * receiving the upload.
 * </p>
 */
public class RequestTimeoutException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Client
     * </p>
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private String type;
    /**
     * <p>
     * 408 Request Timeout
     * </p>
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private String code;

    /**
     * Constructs a new RequestTimeoutException with the specified error
     * message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public RequestTimeoutException(String message) {
        super(message);
    }

    /**
     * <p>
     * Client
     * </p>
     * 
     * @param type
     *        Client
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Client
     * </p>
     * 
     * @return Client
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Client
     * </p>
     * 
     * @param type
     *        Client
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RequestTimeoutException withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * 408 Request Timeout
     * </p>
     * 
     * @param code
     *        408 Request Timeout
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * 408 Request Timeout
     * </p>
     * 
     * @return 408 Request Timeout
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * 408 Request Timeout
     * </p>
     * 
     * @param code
     *        408 Request Timeout
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RequestTimeoutException withCode(String code) {
        setCode(code);
        return this;
    }

}