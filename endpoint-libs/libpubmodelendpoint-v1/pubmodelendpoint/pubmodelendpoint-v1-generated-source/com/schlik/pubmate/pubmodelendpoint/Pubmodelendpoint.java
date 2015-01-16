/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-11-17 18:43:33 UTC)
 * on 2015-01-16 at 20:09:30 UTC 
 * Modify at your own risk.
 */

package com.schlik.pubmate.pubmodelendpoint;

/**
 * Service definition for Pubmodelendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link PubmodelendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Pubmodelendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the pubmodelendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://pubchum.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "pubmodelendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Pubmodelendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Pubmodelendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getPubModel".
   *
   * This request holds the parameters needed by the pubmodelendpoint server.  After setting any
   * optional parameters, call the {@link GetPubModel#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public GetPubModel getPubModel(java.lang.Long id) throws java.io.IOException {
    GetPubModel result = new GetPubModel(id);
    initialize(result);
    return result;
  }

  public class GetPubModel extends PubmodelendpointRequest<com.schlik.pubmate.pubmodelendpoint.model.PubModel> {

    private static final String REST_PATH = "pubmodel/{id}";

    /**
     * Create a request for the method "getPubModel".
     *
     * This request holds the parameters needed by the the pubmodelendpoint server.  After setting any
     * optional parameters, call the {@link GetPubModel#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetPubModel#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetPubModel(java.lang.Long id) {
      super(Pubmodelendpoint.this, "GET", REST_PATH, null, com.schlik.pubmate.pubmodelendpoint.model.PubModel.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetPubModel setAlt(java.lang.String alt) {
      return (GetPubModel) super.setAlt(alt);
    }

    @Override
    public GetPubModel setFields(java.lang.String fields) {
      return (GetPubModel) super.setFields(fields);
    }

    @Override
    public GetPubModel setKey(java.lang.String key) {
      return (GetPubModel) super.setKey(key);
    }

    @Override
    public GetPubModel setOauthToken(java.lang.String oauthToken) {
      return (GetPubModel) super.setOauthToken(oauthToken);
    }

    @Override
    public GetPubModel setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetPubModel) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetPubModel setQuotaUser(java.lang.String quotaUser) {
      return (GetPubModel) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetPubModel setUserIp(java.lang.String userIp) {
      return (GetPubModel) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetPubModel setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetPubModel set(String parameterName, Object value) {
      return (GetPubModel) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertPubModel".
   *
   * This request holds the parameters needed by the pubmodelendpoint server.  After setting any
   * optional parameters, call the {@link InsertPubModel#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.schlik.pubmate.pubmodelendpoint.model.PubModel}
   * @return the request
   */
  public InsertPubModel insertPubModel(com.schlik.pubmate.pubmodelendpoint.model.PubModel content) throws java.io.IOException {
    InsertPubModel result = new InsertPubModel(content);
    initialize(result);
    return result;
  }

  public class InsertPubModel extends PubmodelendpointRequest<com.schlik.pubmate.pubmodelendpoint.model.PubModel> {

    private static final String REST_PATH = "pubmodel";

    /**
     * Create a request for the method "insertPubModel".
     *
     * This request holds the parameters needed by the the pubmodelendpoint server.  After setting any
     * optional parameters, call the {@link InsertPubModel#execute()} method to invoke the remote
     * operation. <p> {@link InsertPubModel#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.schlik.pubmate.pubmodelendpoint.model.PubModel}
     * @since 1.13
     */
    protected InsertPubModel(com.schlik.pubmate.pubmodelendpoint.model.PubModel content) {
      super(Pubmodelendpoint.this, "POST", REST_PATH, content, com.schlik.pubmate.pubmodelendpoint.model.PubModel.class);
    }

    @Override
    public InsertPubModel setAlt(java.lang.String alt) {
      return (InsertPubModel) super.setAlt(alt);
    }

    @Override
    public InsertPubModel setFields(java.lang.String fields) {
      return (InsertPubModel) super.setFields(fields);
    }

    @Override
    public InsertPubModel setKey(java.lang.String key) {
      return (InsertPubModel) super.setKey(key);
    }

    @Override
    public InsertPubModel setOauthToken(java.lang.String oauthToken) {
      return (InsertPubModel) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertPubModel setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertPubModel) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertPubModel setQuotaUser(java.lang.String quotaUser) {
      return (InsertPubModel) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertPubModel setUserIp(java.lang.String userIp) {
      return (InsertPubModel) super.setUserIp(userIp);
    }

    @Override
    public InsertPubModel set(String parameterName, Object value) {
      return (InsertPubModel) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listPubModel".
   *
   * This request holds the parameters needed by the pubmodelendpoint server.  After setting any
   * optional parameters, call the {@link ListPubModel#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListPubModel listPubModel() throws java.io.IOException {
    ListPubModel result = new ListPubModel();
    initialize(result);
    return result;
  }

  public class ListPubModel extends PubmodelendpointRequest<com.schlik.pubmate.pubmodelendpoint.model.CollectionResponsePubModel> {

    private static final String REST_PATH = "pubmodel";

    /**
     * Create a request for the method "listPubModel".
     *
     * This request holds the parameters needed by the the pubmodelendpoint server.  After setting any
     * optional parameters, call the {@link ListPubModel#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListPubModel#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListPubModel() {
      super(Pubmodelendpoint.this, "GET", REST_PATH, null, com.schlik.pubmate.pubmodelendpoint.model.CollectionResponsePubModel.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListPubModel setAlt(java.lang.String alt) {
      return (ListPubModel) super.setAlt(alt);
    }

    @Override
    public ListPubModel setFields(java.lang.String fields) {
      return (ListPubModel) super.setFields(fields);
    }

    @Override
    public ListPubModel setKey(java.lang.String key) {
      return (ListPubModel) super.setKey(key);
    }

    @Override
    public ListPubModel setOauthToken(java.lang.String oauthToken) {
      return (ListPubModel) super.setOauthToken(oauthToken);
    }

    @Override
    public ListPubModel setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListPubModel) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListPubModel setQuotaUser(java.lang.String quotaUser) {
      return (ListPubModel) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListPubModel setUserIp(java.lang.String userIp) {
      return (ListPubModel) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListPubModel setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListPubModel setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListPubModel set(String parameterName, Object value) {
      return (ListPubModel) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removePubModel".
   *
   * This request holds the parameters needed by the pubmodelendpoint server.  After setting any
   * optional parameters, call the {@link RemovePubModel#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemovePubModel removePubModel(java.lang.Long id) throws java.io.IOException {
    RemovePubModel result = new RemovePubModel(id);
    initialize(result);
    return result;
  }

  public class RemovePubModel extends PubmodelendpointRequest<Void> {

    private static final String REST_PATH = "pubmodel/{id}";

    /**
     * Create a request for the method "removePubModel".
     *
     * This request holds the parameters needed by the the pubmodelendpoint server.  After setting any
     * optional parameters, call the {@link RemovePubModel#execute()} method to invoke the remote
     * operation. <p> {@link RemovePubModel#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemovePubModel(java.lang.Long id) {
      super(Pubmodelendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemovePubModel setAlt(java.lang.String alt) {
      return (RemovePubModel) super.setAlt(alt);
    }

    @Override
    public RemovePubModel setFields(java.lang.String fields) {
      return (RemovePubModel) super.setFields(fields);
    }

    @Override
    public RemovePubModel setKey(java.lang.String key) {
      return (RemovePubModel) super.setKey(key);
    }

    @Override
    public RemovePubModel setOauthToken(java.lang.String oauthToken) {
      return (RemovePubModel) super.setOauthToken(oauthToken);
    }

    @Override
    public RemovePubModel setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemovePubModel) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemovePubModel setQuotaUser(java.lang.String quotaUser) {
      return (RemovePubModel) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemovePubModel setUserIp(java.lang.String userIp) {
      return (RemovePubModel) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemovePubModel setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemovePubModel set(String parameterName, Object value) {
      return (RemovePubModel) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updatePubModel".
   *
   * This request holds the parameters needed by the pubmodelendpoint server.  After setting any
   * optional parameters, call the {@link UpdatePubModel#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.schlik.pubmate.pubmodelendpoint.model.PubModel}
   * @return the request
   */
  public UpdatePubModel updatePubModel(com.schlik.pubmate.pubmodelendpoint.model.PubModel content) throws java.io.IOException {
    UpdatePubModel result = new UpdatePubModel(content);
    initialize(result);
    return result;
  }

  public class UpdatePubModel extends PubmodelendpointRequest<com.schlik.pubmate.pubmodelendpoint.model.PubModel> {

    private static final String REST_PATH = "pubmodel";

    /**
     * Create a request for the method "updatePubModel".
     *
     * This request holds the parameters needed by the the pubmodelendpoint server.  After setting any
     * optional parameters, call the {@link UpdatePubModel#execute()} method to invoke the remote
     * operation. <p> {@link UpdatePubModel#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.schlik.pubmate.pubmodelendpoint.model.PubModel}
     * @since 1.13
     */
    protected UpdatePubModel(com.schlik.pubmate.pubmodelendpoint.model.PubModel content) {
      super(Pubmodelendpoint.this, "PUT", REST_PATH, content, com.schlik.pubmate.pubmodelendpoint.model.PubModel.class);
    }

    @Override
    public UpdatePubModel setAlt(java.lang.String alt) {
      return (UpdatePubModel) super.setAlt(alt);
    }

    @Override
    public UpdatePubModel setFields(java.lang.String fields) {
      return (UpdatePubModel) super.setFields(fields);
    }

    @Override
    public UpdatePubModel setKey(java.lang.String key) {
      return (UpdatePubModel) super.setKey(key);
    }

    @Override
    public UpdatePubModel setOauthToken(java.lang.String oauthToken) {
      return (UpdatePubModel) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdatePubModel setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdatePubModel) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdatePubModel setQuotaUser(java.lang.String quotaUser) {
      return (UpdatePubModel) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdatePubModel setUserIp(java.lang.String userIp) {
      return (UpdatePubModel) super.setUserIp(userIp);
    }

    @Override
    public UpdatePubModel set(String parameterName, Object value) {
      return (UpdatePubModel) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Pubmodelendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Pubmodelendpoint}. */
    @Override
    public Pubmodelendpoint build() {
      return new Pubmodelendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link PubmodelendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setPubmodelendpointRequestInitializer(
        PubmodelendpointRequestInitializer pubmodelendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(pubmodelendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
