package defpackage;

import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: bff  reason: default package */
public enum bff {
    URL(3, "url"),
    FOLDER(4, "folder"),
    INLINE_BUTTON(5, "inline_button"),
    FROM_NOTIFICATION(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, "from_notification"),
    FROM_SEARCH(1003, "from_search");
    
    public static final qr4 c = null;
    public final String a;
    public final int b;

    static {
        bff[] bffArr;
        y0 = new pz4(bffArr);
        c = new qr4(19);
    }

    /* access modifiers changed from: public */
    bff(int i, String str) {
        this.a = str;
        this.b = i;
    }
}
