package one.me.deeplink;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/deeplink/InvalidDeeplinkNamingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "deep-link_release"}, k = 1, mv = {2, 0, 0})
public final class InvalidDeeplinkNamingException extends RuntimeException {
    public InvalidDeeplinkNamingException(String str) {
        super(wn6.i("Route=", str, " is not starting with :"));
    }
}
