package ru.ok.android.externcalls.sdk.api;

import android.net.Uri;
import java.io.IOException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonParseException;

public class GetAnonymTokenByLinkRequest extends b0 implements yk {
    private static final h67 PARSER = new yc5(20);
    public final String joinLink;
    public final String name;

    public static final class Response {
        public final String token;
        public final String uid;

        public Response(String str, String str2) {
            this.uid = str;
            this.token = str2;
        }
    }

    public GetAnonymTokenByLinkRequest(String str, String str2) {
        this.joinLink = str;
        this.name = str2;
    }

    public static boolean isAuthRequired(ApiInvocationException apiInvocationException) {
        return apiInvocationException.a == 457;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Response lambda$static$0(m67 m67) throws IOException, JsonParseException {
        m67.s();
        String str = null;
        String str2 = null;
        while (m67.hasNext()) {
            String T = m67.T();
            T.getClass();
            if (T.equals("uid")) {
                str = m67.H();
            } else if (!T.equals(ApiProtocol.KEY_TOKEN)) {
                m67.z();
            } else {
                str2 = m67.H();
            }
        }
        m67.q();
        return new Response(str, str2);
    }

    public /* bridge */ /* synthetic */ xk getConfigExtractor() {
        return xk.e;
    }

    public /* bridge */ /* synthetic */ h67 getFailParser() {
        return oa2.a;
    }

    public h67 getOkParser() {
        return PARSER;
    }

    public /* bridge */ /* synthetic */ int getPriority() {
        return 16;
    }

    public /* bridge */ /* synthetic */ kl getScope() {
        return kl.o;
    }

    public /* bridge */ /* synthetic */ ll getScopeAfter() {
        return ll.a;
    }

    public Uri getUri() {
        return sl.a("vchat.getAnonymTokenByLink");
    }

    public void populateParams(el elVar) {
        elVar.b(ApiProtocol.PARAM_JOIN_LINK, this.joinLink);
        elVar.b("anonymName", this.name);
    }

    public /* bridge */ /* synthetic */ boolean shouldGzip() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean shouldReport() {
        return true;
    }

    public GetAnonymTokenByLinkRequest(String str) {
        this(str, (String) null);
    }
}
