// Autogenerated by convert_protofile.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../templates/Response.java
package com.rethinkdb.response;

import com.rethinkdb.proto.ResponseType;
import com.rethinkdb.proto.ResponseNote;

import java.util.*;
import java.nio.ByteBuffer;

public class Response {
    private long token;
    private ResponseType responseType;
    private ArrayList<ResponseNote> responseNotes;

    public Response(){
        throw new RuntimeException("Response constructor not implemented");
    }

    public ResponseType getType() {
        return responseType;
    }

    public long getToken() {
        return token;
    }

    public Datum getResponse() {
        throw new RuntimeException("getResponse not implemented");
    }

    public Datum getResponse(int x) {
        throw new RuntimeException("getResponse:1 not implemented");
    }

    public <T> List<T> getResponseList() {
        throw new RuntimeException("getResponseList not implemented");
    }

    public static Response parseFrom(byte[] buf) {
        throw new RuntimeException("parseFrom not implemented");
    }

    public boolean isPartial() {
        return responseType == ResponseType.SUCCESS_PARTIAL;
    }

    /* Autogenerated methods */
    public boolean isFeed() {
        return responseNotes.contains(ResponseNote.SEQUENCE_FEED)
            || responseNotes.contains(ResponseNote.ATOM_FEED)
            || responseNotes.contains(ResponseNote.ORDER_BY_LIMIT_FEED)
            || responseNotes.contains(ResponseNote.UNIONED_FEED);
    }

    public boolean isSequenceFeed() {
        return responseNotes.contains(ResponseNote.SEQUENCE_FEED);
    }
    public boolean isAtomFeed() {
        return responseNotes.contains(ResponseNote.ATOM_FEED);
    }
    public boolean isOrderByLimitFeed() {
        return responseNotes.contains(ResponseNote.ORDER_BY_LIMIT_FEED);
    }
    public boolean isUnionedFeed() {
        return responseNotes.contains(ResponseNote.UNIONED_FEED);
    }
    public boolean includesStates() {
        return responseNotes.contains(ResponseNote.INCLUDES_STATES);
    }
}
