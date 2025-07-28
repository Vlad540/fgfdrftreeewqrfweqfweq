package defpackage;

import android.net.Uri;
import java.io.IOException;
import ru.ok.android.api.core.ApiException;

/* renamed from: ez0  reason: default package */
public final class ez0 implements hl {
    public final void debugApiException(vk vkVar, fl flVar, ApiException apiException) {
        Uri uri = flVar.getUri();
        String message = apiException.getMessage();
        udd.S("ApiProviderTag", "debugApiException: " + uri + " " + message, apiException);
    }

    public final void debugApiRequest(vk vkVar, fl flVar, wk wkVar) {
        Uri uri = flVar.getUri();
        udd.p("ApiProviderTag", "debugApiRequest: " + uri, new Object[0]);
    }

    public final m67 debugApiResponseFail(vk vkVar, fl flVar, m67 m67) {
        Uri uri = flVar.getUri();
        udd.T("ApiProviderTag", "debugApiResponseFail: " + uri, new Object[0]);
        return m67;
    }

    public final m67 debugApiResponseOk(vk vkVar, fl flVar, m67 m67) {
        Uri uri = flVar.getUri();
        udd.p("ApiProviderTag", "debugApiResponseOk: " + uri, new Object[0]);
        return m67;
    }

    public final void debugIoException(vk vkVar, fl flVar, IOException iOException) {
        Uri uri = flVar.getUri();
        String message = iOException.getMessage();
        udd.S("ApiProviderTag", "debugIoException: " + uri + " " + message, iOException);
    }
}
