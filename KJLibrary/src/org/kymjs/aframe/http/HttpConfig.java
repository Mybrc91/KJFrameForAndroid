/*
 * Copyright (c) 2014, KJFrameForAndroid 张涛 (kymjs123@gmail.com).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kymjs.aframe.http;

/**
 * HttpClient请求的配置类
 * 
 * @author kymjs(kymjs123@gmail.com)
 * @version 1.1
 * @created 2014-6-5
 */
public class HttpConfig {
    private static final int DEFAULT_SOCKET_BUFFER_SIZE = 8 * 1024; // 8KB
    private static final int SOCKET_TIMEOUT = 8 * 1000; // 8秒
    private static final int READ_TIMEOUT = 8 * 1000; // 8秒
    private static final String CHAR_SET = "UTF8";
    private static final String REQUEST_METHOD = "GET";
    private static final boolean DO_OUT_PUT = true;
    private static final String TYPE = "application/octet-stream";

    private int socketBuffer; // socket缓冲区大小
    private int connectTimeOut; // 连接主机超时时间
    private int readTimeout; // 从主机读取数据超时时间
    private String charSet; // 字符编码格式
    private String requestMethod; // 请求方式GET、POST、HEAD、OPTIONS、PUT、DELETE、TRACE
    private boolean doOutput; // 是否输出
    private boolean doInput; // 是否输入
    private boolean followRedirects; // 是否自动执行HTTP重定向
    private boolean useCache;
    private String contentType;

    public HttpConfig() {
        socketBuffer = DEFAULT_SOCKET_BUFFER_SIZE;
        connectTimeOut = SOCKET_TIMEOUT;
        readTimeout = READ_TIMEOUT;
        charSet = CHAR_SET;
        doOutput = DO_OUT_PUT;
        requestMethod = REQUEST_METHOD;
        useCache = false;
        contentType = TYPE;
    }

    public boolean isUseCache() {
        return useCache;
    }

    public void setUseCache(boolean useCache) {
        this.useCache = useCache;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public int getSocketBuffer() {
        return socketBuffer;
    }

    public void setSocketBuffer(int socketBuffer) {
        this.socketBuffer = socketBuffer;
    }

    public int getConnectTimeOut() {
        return connectTimeOut;
    }

    public void setConnectTimeOut(int connectTimeOut) {
        this.connectTimeOut = connectTimeOut;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public String getCharSet() {
        return charSet;
    }

    public void setCharSet(String charSet) {
        this.charSet = charSet;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public boolean isDoOutput() {
        return doOutput;
    }

    public void setDoOutput(boolean doOutput) {
        this.doOutput = doOutput;
    }

    public boolean isDoInput() {
        return doInput;
    }

    public void setDoInput(boolean doInput) {
        this.doInput = doInput;
    }

    public boolean isFollowRedirects() {
        return followRedirects;
    }

    public void setFollowRedirects(boolean followRedirects) {
        this.followRedirects = followRedirects;
    }
}