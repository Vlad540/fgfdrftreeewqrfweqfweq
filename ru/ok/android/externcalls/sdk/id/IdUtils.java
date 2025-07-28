package ru.ok.android.externcalls.sdk.id;

import ru.ok.android.externcalls.sdk.api.InternalIdResponse;

public final class IdUtils {
    private IdUtils() {
        throw new AssertionError("utility class");
    }

    public static nj0 resolveInternalRequest(String str, boolean z) {
        mj0 R = ez3.R("vchat.getOkIdByExternalId");
        R.b = kl.c;
        R.b("externalId", str);
        R.c("anonym", z);
        return R.a(InternalIdResponse.PARSER);
    }
}
