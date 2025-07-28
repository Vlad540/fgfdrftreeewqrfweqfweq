package defpackage;

/* renamed from: vo7  reason: default package */
public final class vo7 extends Error {
    public final String a;

    public vo7(String str, byte b) {
        super(str, (Throwable) null);
        this.a = str;
    }

    public final String getMessage() {
        return this.a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public vo7(String str, int i) {
        this(wn6.i("InvalidPhoneNumber (", str, ")"), (byte) 0);
        switch (i) {
            case 1:
                this(wn6.i("SmsAttemptExceed (Phone: ", str, ")"), (byte) 0);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public vo7(String str, Throwable th) {
        this(me4.i(str == null ? "Unspecified" : str, " | ", th != null ? th.getMessage() : null), (byte) 0);
    }
}
