package one.me.sdk.transfer.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/transfer/exceptions/HttpUrlExpiredException;", "Lone/me/sdk/transfer/exceptions/HttpErrorException;", "transfer_release"}, k = 1, mv = {2, 0, 0})
public final class HttpUrlExpiredException extends HttpErrorException {
    public HttpUrlExpiredException() {
        this((String) null, (am6) null, (String) null, 7);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpUrlExpiredException(java.lang.String r3, defpackage.am6 r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0006
            r3 = r1
        L_0x0006:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x000b
            r4 = r1
        L_0x000b:
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0010
            r5 = r1
        L_0x0010:
            if (r3 != 0) goto L_0x0014
            java.lang.String r3 = "Expired url"
        L_0x0014:
            r2.<init>(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.transfer.exceptions.HttpUrlExpiredException.<init>(java.lang.String, am6, java.lang.String, int):void");
    }
}
