// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/proxy/http/config.proto

package com.v2ray.core.proxy.http;

public interface ServerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.proxy.http.ServerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 timeout = 1 [deprecated = true];</code>
   */
  @Deprecated int getTimeout();

  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */
  int getAccountsCount();
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */
  boolean containsAccounts(
          String key);
  /**
   * Use {@link #getAccountsMap()} instead.
   */
  @Deprecated
  java.util.Map<String, String>
  getAccounts();
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */
  java.util.Map<String, String>
  getAccountsMap();
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */

  String getAccountsOrDefault(
          String key,
          String defaultValue);
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */

  String getAccountsOrThrow(
          String key);

  /**
   * <code>bool allow_transparent = 3;</code>
   */
  boolean getAllowTransparent();

  /**
   * <code>uint32 user_level = 4;</code>
   */
  int getUserLevel();
}
