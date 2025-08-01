package one.me.net.ssl.api;

import javax.net.ssl.SSLException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/net/ssl/api/InvalidSslSessionException;", "Ljavax/net/ssl/SSLException;", "api_release"}, k = 1, mv = {2, 0, 0})
public final class InvalidSslSessionException extends SSLException {
    public InvalidSslSessionException() {
        this((String) null, 3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvalidSslSessionException(String str, int i) {
        super((i & 1) != 0 ? null : str, (Throwable) null);
    }
}
