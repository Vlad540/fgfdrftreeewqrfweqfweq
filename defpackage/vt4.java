package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: vt4  reason: default package */
public final class vt4 {
    public final afc a;
    public int b = Integer.MAX_VALUE;
    public int c = 0;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, afc] */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.text.Editable$Factory, wt4] */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vt4(android.widget.EditText r6, boolean r7) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r5.b = r0
            r0 = 0
            r5.c = r0
            java.lang.String r1 = "editText cannot be null"
            defpackage.e07.o(r6, r1)
            afc r1 = new afc
            r1.<init>()
            r1.a = r6
            kv4 r2 = new kv4
            r2.<init>(r6, r7)
            r1.b = r2
            r6.addTextChangedListener(r2)
            wt4 r7 = defpackage.wt4.b
            if (r7 != 0) goto L_0x0048
            java.lang.Object r7 = defpackage.wt4.a
            monitor-enter(r7)
            wt4 r2 = defpackage.wt4.b     // Catch:{ all -> 0x0042 }
            if (r2 != 0) goto L_0x0044
            wt4 r2 = new wt4     // Catch:{ all -> 0x0042 }
            r2.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = "android.text.DynamicLayout$ChangeWatcher"
            java.lang.Class<wt4> r4 = defpackage.wt4.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ all -> 0x003f }
            java.lang.Class r0 = java.lang.Class.forName(r3, r0, r4)     // Catch:{ all -> 0x003f }
            defpackage.wt4.c = r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            defpackage.wt4.b = r2     // Catch:{ all -> 0x0042 }
            goto L_0x0044
        L_0x0042:
            r5 = move-exception
            goto L_0x0046
        L_0x0044:
            monitor-exit(r7)     // Catch:{ all -> 0x0042 }
            goto L_0x0048
        L_0x0046:
            monitor-exit(r7)     // Catch:{ all -> 0x0042 }
            throw r5
        L_0x0048:
            wt4 r7 = defpackage.wt4.b
            r6.setEditableFactory(r7)
            r5.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt4.<init>(android.widget.EditText, boolean):void");
    }

    public final cu4 a(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        afc afc = this.a;
        afc.getClass();
        if (!(inputConnection instanceof cu4)) {
            inputConnection = new cu4((EditText) afc.a, inputConnection, editorInfo);
        }
        return (cu4) inputConnection;
    }
}
