package defpackage;

import java.util.concurrent.Callable;

/* renamed from: wxe  reason: default package */
public final class wxe implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pec b;
    public final /* synthetic */ yxe c;

    public /* synthetic */ wxe(yxe yxe, pec pec, int i) {
        this.a = i;
        this.c = yxe;
        this.b = pec;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: gwe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r15v1, types: [tu1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v8, types: [java.lang.Object, pxe] */
    /* JADX WARNING: type inference failed for: r2v11, types: [tu1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v12, types: [java.lang.Object, pxe] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0280 A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0283 A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x029b A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029c A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ae A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0161 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e5 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e9 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f5 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0109 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0115 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0119 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0134 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0136 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014f A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0253 A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0256 A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0262 A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0265 A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0271 A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0274 A[Catch:{ all -> 0x01fa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r24 = this;
            r0 = r24
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x018d;
                default: goto L_0x0007;
            }
        L_0x0007:
            yxe r1 = r0.c
            aec r1 = r1.a
            pec r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "attach_local_id"
            int r0 = defpackage.gp0.o(r1, r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r3 = "prepared_path"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "file_name"
            int r4 = defpackage.gp0.o(r1, r4)     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = "upload_url"
            int r5 = defpackage.gp0.o(r1, r5)     // Catch:{ all -> 0x0083 }
            java.lang.String r6 = "upload_progress"
            int r6 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x0083 }
            java.lang.String r7 = "total_bytes"
            int r7 = defpackage.gp0.o(r1, r7)     // Catch:{ all -> 0x0083 }
            java.lang.String r8 = "upload_status"
            int r8 = defpackage.gp0.o(r1, r8)     // Catch:{ all -> 0x0083 }
            java.lang.String r9 = "created_time"
            int r9 = defpackage.gp0.o(r1, r9)     // Catch:{ all -> 0x0083 }
            java.lang.String r10 = "path"
            int r10 = defpackage.gp0.o(r1, r10)     // Catch:{ all -> 0x0083 }
            java.lang.String r11 = "last_modified"
            int r11 = defpackage.gp0.o(r1, r11)     // Catch:{ all -> 0x0083 }
            java.lang.String r12 = "upload_type"
            int r12 = defpackage.gp0.o(r1, r12)     // Catch:{ all -> 0x0083 }
            java.lang.String r13 = "photo_token"
            int r13 = defpackage.gp0.o(r1, r13)     // Catch:{ all -> 0x0083 }
            java.lang.String r14 = "attach_id"
            int r14 = defpackage.gp0.o(r1, r14)     // Catch:{ all -> 0x0083 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0083 }
            int r2 = r1.getCount()     // Catch:{ all -> 0x0083 }
            r15.<init>(r2)     // Catch:{ all -> 0x0083 }
        L_0x0069:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0184
            tu1 r2 = new tu1     // Catch:{ all -> 0x0083 }
            r2.<init>()     // Catch:{ all -> 0x0083 }
            boolean r16 = r1.isNull(r10)     // Catch:{ all -> 0x0083 }
            if (r16 == 0) goto L_0x0086
            r16 = r15
            r15 = 0
            r2.c = r15     // Catch:{ all -> 0x0083 }
        L_0x007f:
            r15 = r9
            r17 = r10
            goto L_0x008f
        L_0x0083:
            r0 = move-exception
            goto L_0x0189
        L_0x0086:
            r16 = r15
            java.lang.String r15 = r1.getString(r10)     // Catch:{ all -> 0x0083 }
            r2.c = r15     // Catch:{ all -> 0x0083 }
            goto L_0x007f
        L_0x008f:
            long r9 = r1.getLong(r11)     // Catch:{ all -> 0x0083 }
            r2.b = r9     // Catch:{ all -> 0x0083 }
            boolean r9 = r1.isNull(r12)     // Catch:{ all -> 0x0083 }
            if (r9 == 0) goto L_0x009d
            r9 = 0
            goto L_0x00a5
        L_0x009d:
            int r9 = r1.getInt(r12)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0083 }
        L_0x00a5:
            int r9 = defpackage.gp0.w(r9)     // Catch:{ all -> 0x0083 }
            r2.a = r9     // Catch:{ all -> 0x0083 }
            boolean r9 = r1.isNull(r13)     // Catch:{ all -> 0x0083 }
            if (r9 == 0) goto L_0x00bc
            boolean r9 = r1.isNull(r14)     // Catch:{ all -> 0x0083 }
            if (r9 != 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            r18 = r11
            r9 = 0
            goto L_0x00da
        L_0x00bc:
            pxe r9 = new pxe     // Catch:{ all -> 0x0083 }
            r9.<init>()     // Catch:{ all -> 0x0083 }
            boolean r10 = r1.isNull(r13)     // Catch:{ all -> 0x0083 }
            if (r10 == 0) goto L_0x00cd
            r10 = 0
            r9.a = r10     // Catch:{ all -> 0x0083 }
        L_0x00ca:
            r18 = r11
            goto L_0x00d4
        L_0x00cd:
            java.lang.String r10 = r1.getString(r13)     // Catch:{ all -> 0x0083 }
            r9.a = r10     // Catch:{ all -> 0x0083 }
            goto L_0x00ca
        L_0x00d4:
            long r10 = r1.getLong(r14)     // Catch:{ all -> 0x0083 }
            r9.b = r10     // Catch:{ all -> 0x0083 }
        L_0x00da:
            gwe r10 = new gwe     // Catch:{ all -> 0x0083 }
            r10.<init>()     // Catch:{ all -> 0x0083 }
            boolean r11 = r1.isNull(r0)     // Catch:{ all -> 0x0083 }
            if (r11 == 0) goto L_0x00e9
            r11 = 0
            r10.b = r11     // Catch:{ all -> 0x0083 }
            goto L_0x00ef
        L_0x00e9:
            java.lang.String r11 = r1.getString(r0)     // Catch:{ all -> 0x0083 }
            r10.b = r11     // Catch:{ all -> 0x0083 }
        L_0x00ef:
            boolean r11 = r1.isNull(r3)     // Catch:{ all -> 0x0083 }
            if (r11 == 0) goto L_0x00f9
            r11 = 0
            r10.c = r11     // Catch:{ all -> 0x0083 }
            goto L_0x00ff
        L_0x00f9:
            java.lang.String r11 = r1.getString(r3)     // Catch:{ all -> 0x0083 }
            r10.c = r11     // Catch:{ all -> 0x0083 }
        L_0x00ff:
            boolean r11 = r1.isNull(r4)     // Catch:{ all -> 0x0083 }
            if (r11 == 0) goto L_0x0109
            r11 = 0
            r10.d = r11     // Catch:{ all -> 0x0083 }
            goto L_0x010f
        L_0x0109:
            java.lang.String r11 = r1.getString(r4)     // Catch:{ all -> 0x0083 }
            r10.d = r11     // Catch:{ all -> 0x0083 }
        L_0x010f:
            boolean r11 = r1.isNull(r5)     // Catch:{ all -> 0x0083 }
            if (r11 == 0) goto L_0x0119
            r11 = 0
            r10.e = r11     // Catch:{ all -> 0x0083 }
            goto L_0x011f
        L_0x0119:
            java.lang.String r11 = r1.getString(r5)     // Catch:{ all -> 0x0083 }
            r10.e = r11     // Catch:{ all -> 0x0083 }
        L_0x011f:
            float r11 = r1.getFloat(r6)     // Catch:{ all -> 0x0083 }
            r10.f = r11     // Catch:{ all -> 0x0083 }
            r11 = r3
            r19 = r4
            long r3 = r1.getLong(r7)     // Catch:{ all -> 0x0083 }
            r10.g = r3     // Catch:{ all -> 0x0083 }
            boolean r3 = r1.isNull(r8)     // Catch:{ all -> 0x0083 }
            if (r3 == 0) goto L_0x0136
            r3 = 0
            goto L_0x013e
        L_0x0136:
            int r3 = r1.getInt(r8)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0083 }
        L_0x013e:
            int r3 = r3.intValue()     // Catch:{ all -> 0x0083 }
            rxe[] r4 = defpackage.rxe.X     // Catch:{ all -> 0x0083 }
            r20 = r0
            int r0 = r4.length     // Catch:{ all -> 0x0083 }
            r21 = 0
            r22 = r5
            r5 = r21
        L_0x014d:
            if (r5 >= r0) goto L_0x0161
            r21 = r0
            r0 = r4[r5]     // Catch:{ all -> 0x0083 }
            r23 = r4
            int r4 = r0.a     // Catch:{ all -> 0x0083 }
            if (r4 != r3) goto L_0x015a
            goto L_0x0163
        L_0x015a:
            int r5 = r5 + 1
            r0 = r21
            r4 = r23
            goto L_0x014d
        L_0x0161:
            rxe r0 = defpackage.rxe.UNKNOWN     // Catch:{ all -> 0x0083 }
        L_0x0163:
            r10.h = r0     // Catch:{ all -> 0x0083 }
            r0 = r15
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0083 }
            r10.j = r3     // Catch:{ all -> 0x0083 }
            r10.a = r2     // Catch:{ all -> 0x0083 }
            r10.i = r9     // Catch:{ all -> 0x0083 }
            r2 = r16
            r2.add(r10)     // Catch:{ all -> 0x0083 }
            r9 = r0
            r15 = r2
            r3 = r11
            r10 = r17
            r11 = r18
            r4 = r19
            r0 = r20
            r5 = r22
            goto L_0x0069
        L_0x0184:
            r2 = r15
            r1.close()
            return r2
        L_0x0189:
            r1.close()
            throw r0
        L_0x018d:
            yxe r1 = r0.c
            aec r1 = r1.a
            pec r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "attach_local_id"
            int r0 = defpackage.gp0.o(r1, r0)     // Catch:{ all -> 0x01fa }
            java.lang.String r3 = "prepared_path"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x01fa }
            java.lang.String r4 = "file_name"
            int r4 = defpackage.gp0.o(r1, r4)     // Catch:{ all -> 0x01fa }
            java.lang.String r5 = "upload_url"
            int r5 = defpackage.gp0.o(r1, r5)     // Catch:{ all -> 0x01fa }
            java.lang.String r6 = "upload_progress"
            int r6 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x01fa }
            java.lang.String r7 = "total_bytes"
            int r7 = defpackage.gp0.o(r1, r7)     // Catch:{ all -> 0x01fa }
            java.lang.String r8 = "upload_status"
            int r8 = defpackage.gp0.o(r1, r8)     // Catch:{ all -> 0x01fa }
            java.lang.String r9 = "created_time"
            int r9 = defpackage.gp0.o(r1, r9)     // Catch:{ all -> 0x01fa }
            java.lang.String r10 = "path"
            int r10 = defpackage.gp0.o(r1, r10)     // Catch:{ all -> 0x01fa }
            java.lang.String r11 = "last_modified"
            int r11 = defpackage.gp0.o(r1, r11)     // Catch:{ all -> 0x01fa }
            java.lang.String r12 = "upload_type"
            int r12 = defpackage.gp0.o(r1, r12)     // Catch:{ all -> 0x01fa }
            java.lang.String r13 = "photo_token"
            int r13 = defpackage.gp0.o(r1, r13)     // Catch:{ all -> 0x01fa }
            java.lang.String r14 = "attach_id"
            int r14 = defpackage.gp0.o(r1, r14)     // Catch:{ all -> 0x01fa }
            boolean r15 = r1.moveToFirst()     // Catch:{ all -> 0x01fa }
            if (r15 == 0) goto L_0x02c7
            tu1 r15 = new tu1     // Catch:{ all -> 0x01fa }
            r15.<init>()     // Catch:{ all -> 0x01fa }
            boolean r16 = r1.isNull(r10)     // Catch:{ all -> 0x01fa }
            if (r16 == 0) goto L_0x01fd
            r15.c = r2     // Catch:{ all -> 0x01fa }
            goto L_0x0203
        L_0x01fa:
            r0 = move-exception
            goto L_0x02cb
        L_0x01fd:
            java.lang.String r10 = r1.getString(r10)     // Catch:{ all -> 0x01fa }
            r15.c = r10     // Catch:{ all -> 0x01fa }
        L_0x0203:
            long r10 = r1.getLong(r11)     // Catch:{ all -> 0x01fa }
            r15.b = r10     // Catch:{ all -> 0x01fa }
            boolean r10 = r1.isNull(r12)     // Catch:{ all -> 0x01fa }
            if (r10 == 0) goto L_0x0211
            r10 = r2
            goto L_0x0219
        L_0x0211:
            int r10 = r1.getInt(r12)     // Catch:{ all -> 0x01fa }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01fa }
        L_0x0219:
            int r10 = defpackage.gp0.w(r10)     // Catch:{ all -> 0x01fa }
            r15.a = r10     // Catch:{ all -> 0x01fa }
            boolean r10 = r1.isNull(r13)     // Catch:{ all -> 0x01fa }
            if (r10 == 0) goto L_0x022e
            boolean r10 = r1.isNull(r14)     // Catch:{ all -> 0x01fa }
            if (r10 != 0) goto L_0x022c
            goto L_0x022e
        L_0x022c:
            r10 = r2
            goto L_0x0248
        L_0x022e:
            pxe r10 = new pxe     // Catch:{ all -> 0x01fa }
            r10.<init>()     // Catch:{ all -> 0x01fa }
            boolean r11 = r1.isNull(r13)     // Catch:{ all -> 0x01fa }
            if (r11 == 0) goto L_0x023c
            r10.a = r2     // Catch:{ all -> 0x01fa }
            goto L_0x0242
        L_0x023c:
            java.lang.String r11 = r1.getString(r13)     // Catch:{ all -> 0x01fa }
            r10.a = r11     // Catch:{ all -> 0x01fa }
        L_0x0242:
            long r11 = r1.getLong(r14)     // Catch:{ all -> 0x01fa }
            r10.b = r11     // Catch:{ all -> 0x01fa }
        L_0x0248:
            gwe r11 = new gwe     // Catch:{ all -> 0x01fa }
            r11.<init>()     // Catch:{ all -> 0x01fa }
            boolean r12 = r1.isNull(r0)     // Catch:{ all -> 0x01fa }
            if (r12 == 0) goto L_0x0256
            r11.b = r2     // Catch:{ all -> 0x01fa }
            goto L_0x025c
        L_0x0256:
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x01fa }
            r11.b = r0     // Catch:{ all -> 0x01fa }
        L_0x025c:
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x0265
            r11.c = r2     // Catch:{ all -> 0x01fa }
            goto L_0x026b
        L_0x0265:
            java.lang.String r0 = r1.getString(r3)     // Catch:{ all -> 0x01fa }
            r11.c = r0     // Catch:{ all -> 0x01fa }
        L_0x026b:
            boolean r0 = r1.isNull(r4)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x0274
            r11.d = r2     // Catch:{ all -> 0x01fa }
            goto L_0x027a
        L_0x0274:
            java.lang.String r0 = r1.getString(r4)     // Catch:{ all -> 0x01fa }
            r11.d = r0     // Catch:{ all -> 0x01fa }
        L_0x027a:
            boolean r0 = r1.isNull(r5)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x0283
            r11.e = r2     // Catch:{ all -> 0x01fa }
            goto L_0x0289
        L_0x0283:
            java.lang.String r0 = r1.getString(r5)     // Catch:{ all -> 0x01fa }
            r11.e = r0     // Catch:{ all -> 0x01fa }
        L_0x0289:
            float r0 = r1.getFloat(r6)     // Catch:{ all -> 0x01fa }
            r11.f = r0     // Catch:{ all -> 0x01fa }
            long r3 = r1.getLong(r7)     // Catch:{ all -> 0x01fa }
            r11.g = r3     // Catch:{ all -> 0x01fa }
            boolean r0 = r1.isNull(r8)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x029c
            goto L_0x02a4
        L_0x029c:
            int r0 = r1.getInt(r8)     // Catch:{ all -> 0x01fa }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01fa }
        L_0x02a4:
            int r0 = r2.intValue()     // Catch:{ all -> 0x01fa }
            rxe[] r2 = defpackage.rxe.X     // Catch:{ all -> 0x01fa }
            int r3 = r2.length     // Catch:{ all -> 0x01fa }
            r4 = 0
        L_0x02ac:
            if (r4 >= r3) goto L_0x02b8
            r5 = r2[r4]     // Catch:{ all -> 0x01fa }
            int r6 = r5.a     // Catch:{ all -> 0x01fa }
            if (r6 != r0) goto L_0x02b5
            goto L_0x02ba
        L_0x02b5:
            int r4 = r4 + 1
            goto L_0x02ac
        L_0x02b8:
            rxe r5 = defpackage.rxe.UNKNOWN     // Catch:{ all -> 0x01fa }
        L_0x02ba:
            r11.h = r5     // Catch:{ all -> 0x01fa }
            long r2 = r1.getLong(r9)     // Catch:{ all -> 0x01fa }
            r11.j = r2     // Catch:{ all -> 0x01fa }
            r11.a = r15     // Catch:{ all -> 0x01fa }
            r11.i = r10     // Catch:{ all -> 0x01fa }
            r2 = r11
        L_0x02c7:
            r1.close()
            return r2
        L_0x02cb:
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxe.call():java.lang.Object");
    }

    public final void finalize() {
        switch (this.a) {
            case 0:
                this.b.m();
                return;
            default:
                this.b.m();
                return;
        }
    }
}
