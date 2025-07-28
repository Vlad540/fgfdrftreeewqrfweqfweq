package defpackage;

import java.io.IOException;
import ru.ok.android.api.core.ApiException;

/* renamed from: hl  reason: default package */
public interface hl {
    public static final gl a = new Object();

    void debugApiException(vk vkVar, fl flVar, ApiException apiException) {
    }

    void debugApiRequest(vk vkVar, fl flVar, wk wkVar) {
    }

    m67 debugApiResponseFail(vk vkVar, fl flVar, m67 m67) {
        return m67;
    }

    m67 debugApiResponseOk(vk vkVar, fl flVar, m67 m67) {
        return m67;
    }

    void debugIoException(vk vkVar, fl flVar, IOException iOException) {
    }
}
