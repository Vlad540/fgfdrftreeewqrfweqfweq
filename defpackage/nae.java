package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import ru.ok.tamtam.util.HandledException;

/* renamed from: nae  reason: default package */
public final class nae implements moa {
    public String a;
    public final String b;
    public final Context c;
    public final b51 d;
    public final qmc e;
    public final zy9 f;
    public final zz9 g;
    public final a04 h;
    public final g2b i;
    public final g15 j;

    public nae(Context context, b51 b51, qmc qmc, zy9 zy9, zz9 zz9, a04 a04, g2b g2b, g15 g15) {
        this.b = context.getString(avb.tt_contact_account_type);
        this.c = context;
        this.d = b51;
        this.e = qmc;
        this.f = zy9;
        this.g = zz9;
        this.h = a04;
        this.i = g2b;
        this.j = g15;
    }

    public static Uri b(Uri uri) {
        return uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
    }

    public final void a(ArrayList arrayList) {
        ArrayList arrayList2;
        List list;
        ArrayList arrayList3;
        xsd xsd = new xsd(29);
        if (arrayList == null || arrayList.isEmpty()) {
            arrayList2 = Collections.emptyList();
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (Object next : arrayList) {
                try {
                    if (xsd.test(next)) {
                        arrayList4.add(Long.valueOf(((ioa) next).Y));
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            arrayList2 = arrayList4;
        }
        di3 di3 = (di3) this.d.a.getValue();
        if (di3 != null) {
            list = di3.k();
        } else {
            udd.r("b51", "contactController is null");
            list = Collections.emptyList();
        }
        if (list == null || list.isEmpty()) {
            arrayList3 = Collections.emptyList();
        } else {
            ArrayList arrayList5 = new ArrayList();
            for (Object next2 : list) {
                try {
                    if (arrayList2.contains(Long.valueOf(((tf3) next2).o()))) {
                        arrayList5.add(Long.valueOf(((tf3) next2).n()));
                    }
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            arrayList3 = arrayList5;
        }
        udd.p("nae", "onPhonebookUpdated: phones=%s, serverPhones=%s, contactIds=%s", new Object[]{Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList3.size())});
        if (!arrayList3.isEmpty()) {
            f(arrayList3);
        }
    }

    public final Uri c() {
        return ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.a).appendQueryParameter("account_type", this.b).build();
    }

    public final void d(tf3 tf3, String str, String str2, String str3) {
        Context context = this.c;
        ContentResolver contentResolver = context.getContentResolver();
        ArrayList arrayList = new ArrayList();
        ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(b(ContactsContract.RawContacts.CONTENT_URI)).withValue("account_name", this.a);
        String str4 = this.b;
        arrayList.add(withValue.withValue("account_type", str4).withValue("sync1", Long.valueOf(tf3.n())).build());
        arrayList.add(ContentProviderOperation.newInsert(b(ContactsContract.Settings.CONTENT_URI)).withValue("account_name", this.a).withValue("account_type", str4).withValue("ungrouped_visible", 1).build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        arrayList.add(ContentProviderOperation.newInsert(b(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
        arrayList.add(ContentProviderOperation.newInsert(b(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str3).withValue("data2", 2).build());
        arrayList.add(ContentProviderOperation.newInsert(b(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", context.getString(avb.tt_contact_mimetype)).withValue("data1", Long.valueOf(tf3.n())).withValue("data2", Long.valueOf(tf3.o())).withValue("data3", tf3.d()).build());
        try {
            contentResolver.applyBatch("com.android.contacts", arrayList);
        } catch (Exception e2) {
            udd.s("nae", "Exception when add for contact our mime type", e2);
            this.j.c(new HandledException(e2), true);
        }
    }

    public final void e(Set set) {
        udd.p("nae", "removeContacts: count=%s", new Object[]{Integer.valueOf(set.size())});
        if (!set.isEmpty()) {
            try {
                udd.p("nae", "removeContacts: deleted count=%s", new Object[]{Integer.valueOf(this.c.getContentResolver().delete(c(), set.size() == 0 ? null : String.format("%1$s IN (%2$s)", new Object[]{"sync1", r1g.s(set)}), (String[]) null))});
            } catch (Exception e2) {
                udd.s("nae", "removeContacts exception", e2);
                this.j.c(new HandledException(e2), true);
            }
        }
    }

    public final void f(Collection collection) {
        udd.p("nae", "sync: count=%s", new Object[]{Integer.valueOf(collection.size())});
        if (!collection.isEmpty()) {
            this.e.b(new vr2(this, collection, false, 4));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x05eb A[SYNTHETIC, Splitter:B:272:0x05eb] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x05f4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(java.util.Collection r40, boolean r41) {
        /*
            r39 = this;
            r1 = r39
            zy9 r0 = r1.f
            boolean r3 = r0.d()
            java.lang.String r4 = "nae"
            if (r3 != 0) goto L_0x0012
            java.lang.String r0 = "syncWorker: not authorized, return"
            udd.q(r4, r0)
            return
        L_0x0012:
            zz9 r3 = r1.g
            t97 r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            qna r3 = (defpackage.qna) r3
            java.lang.String[] r5 = defpackage.qna.g
            boolean r3 = r3.b(r5)
            if (r3 != 0) goto L_0x002a
            java.lang.String r0 = "syncWorker: no permissions, return"
            udd.q(r4, r0)
            return
        L_0x002a:
            java.lang.String r3 = "app.full.contacts.sync.completed"
            g2b r5 = r1.i
            r6 = 0
            if (r41 == 0) goto L_0x0044
            r7 = r5
            j2b r7 = (defpackage.j2b) r7
            i03 r7 = r7.a
            x97 r7 = r7.g
            boolean r7 = r7.getBoolean(r3, r6)
            if (r7 == 0) goto L_0x0044
            java.lang.String r0 = "syncWorker: full sync already completed, return"
            udd.q(r4, r0)
            return
        L_0x0044:
            boolean r7 = r0.d()
            r8 = 0
            if (r7 != 0) goto L_0x004d
            r0 = r8
            goto L_0x005b
        L_0x004d:
            g2b r0 = r0.b()
            j2b r0 = (defpackage.j2b) r0
            f70 r0 = r0.d
            java.lang.String r7 = "auth.account.name"
            java.lang.String r0 = r0.f(r7, r8)
        L_0x005b:
            r1.a = r0
            boolean r0 = r1g.p(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = "syncWorker: accountName empty, return"
            udd.q(r4, r0)
            return
        L_0x0069:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            mi3 r7 = defpackage.mi3.a
            java.lang.String r9 = "b51"
            b51 r10 = r1.d
            if (r41 == 0) goto L_0x00be
            t97 r10 = r10.a
            java.lang.Object r10 = r10.getValue()
            di3 r10 = (defpackage.di3) r10
            if (r10 == 0) goto L_0x0085
            java.util.List r9 = r10.k()
            goto L_0x008e
        L_0x0085:
            java.lang.String r10 = "contactController is null"
            udd.r(r9, r10)
            java.util.List r9 = java.util.Collections.emptyList()
        L_0x008e:
            java.util.Iterator r9 = r9.iterator()
        L_0x0092:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0107
            java.lang.Object r10 = r9.next()
            tf3 r10 = (defpackage.tf3) r10
            if (r10 == 0) goto L_0x0092
            oi3 r11 = r10.a
            ni3 r11 = r11.c
            mi3 r12 = r11.k
            if (r12 != r7) goto L_0x0092
            li3 r11 = r11.i
            if (r11 != 0) goto L_0x0092
            boolean r11 = r10.w()
            if (r11 != 0) goto L_0x0092
            long r11 = r10.n()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r0.put(r11, r10)
            goto L_0x0092
        L_0x00be:
            java.util.Iterator r11 = r40.iterator()
        L_0x00c2:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0107
            java.lang.Object r12 = r11.next()
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            t97 r14 = r10.a
            java.lang.Object r14 = r14.getValue()
            di3 r14 = (defpackage.di3) r14
            if (r14 == 0) goto L_0x00e1
            tf3 r12 = r14.i(r12, r6)
            goto L_0x00e7
        L_0x00e1:
            java.lang.String r12 = "contact is null"
            udd.s(r9, r12, r8)
            r12 = r8
        L_0x00e7:
            if (r12 == 0) goto L_0x00c2
            oi3 r13 = r12.a
            ni3 r13 = r13.c
            mi3 r14 = r13.k
            if (r14 != r7) goto L_0x00c2
            li3 r13 = r13.i
            if (r13 != 0) goto L_0x00c2
            boolean r13 = r12.w()
            if (r13 != 0) goto L_0x00c2
            long r13 = r12.n()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r0.put(r13, r12)
            goto L_0x00c2
        L_0x0107:
            android.content.Context r7 = r1.c
            android.content.ContentResolver r9 = r7.getContentResolver()
            java.lang.String r15 = "sync1"
            java.lang.String r14 = "_id"
            java.lang.String r13 = "contact_id"
            java.lang.String[] r11 = new java.lang.String[]{r15, r14, r13}
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            android.net.Uri r10 = r39.c()
            if (r40 == 0) goto L_0x0138
            int r16 = r40.size()
            if (r16 != 0) goto L_0x0129
            goto L_0x0138
        L_0x0129:
            java.lang.String r2 = r1g.s(r40)
            java.lang.Object[] r2 = new java.lang.Object[]{r15, r2}
            java.lang.String r8 = "%1$s IN (%2$s)"
            java.lang.String r2 = java.lang.String.format(r8, r2)
            goto L_0x0139
        L_0x0138:
            r2 = 0
        L_0x0139:
            r8 = 0
            r17 = 0
            r6 = r12
            r12 = r2
            r2 = r13
            r13 = r8
            r8 = r14
            r14 = r17
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14)
            if (r9 == 0) goto L_0x018f
            java.lang.String r10 = "getRawContacts: count=%s"
            int r11 = r9.getCount()     // Catch:{ all -> 0x0183 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0183 }
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x0183 }
            udd.p(r4, r10, r11)     // Catch:{ all -> 0x0183 }
            int r10 = r9.getColumnIndex(r15)     // Catch:{ all -> 0x0183 }
            int r8 = r9.getColumnIndex(r8)     // Catch:{ all -> 0x0183 }
            int r2 = r9.getColumnIndex(r2)     // Catch:{ all -> 0x0183 }
        L_0x0166:
            boolean r11 = r9.moveToNext()     // Catch:{ all -> 0x0183 }
            if (r11 == 0) goto L_0x018f
            mae r11 = new mae     // Catch:{ all -> 0x0183 }
            long r19 = r9.getLong(r10)     // Catch:{ all -> 0x0183 }
            long r21 = r9.getLong(r8)     // Catch:{ all -> 0x0183 }
            long r23 = r9.getLong(r2)     // Catch:{ all -> 0x0183 }
            r18 = r11
            r18.<init>(r19, r21, r23)     // Catch:{ all -> 0x0183 }
            r6.add(r11)     // Catch:{ all -> 0x0183 }
            goto L_0x0166
        L_0x0183:
            r0 = move-exception
            r1 = r0
            r9.close()     // Catch:{ all -> 0x0189 }
            goto L_0x018e
        L_0x0189:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L_0x018e:
            throw r1
        L_0x018f:
            if (r9 == 0) goto L_0x0194
            r9.close()
        L_0x0194:
            java.util.Collection r2 = r0.values()
            java.util.HashSet r8 = new java.util.HashSet
            r9 = 0
            if (r2 == 0) goto L_0x01d1
            boolean r11 = r2.isEmpty()
            if (r11 == 0) goto L_0x01a5
            goto L_0x01d1
        L_0x01a5:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x01ae:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x01d5
            java.lang.Object r12 = r2.next()
            tf3 r12 = (defpackage.tf3) r12     // Catch:{ all -> 0x01ca }
            long r12 = r12.o()     // Catch:{ all -> 0x01ca }
            java.lang.Long r14 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x01ca }
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x01ae
            r11.add(r14)     // Catch:{ all -> 0x01ca }
            goto L_0x01ae
        L_0x01ca:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x01d1:
            java.util.List r11 = java.util.Collections.emptyList()
        L_0x01d5:
            r8.<init>(r11)
            a04 r2 = r1.h
            hz3 r2 = (defpackage.hz3) r2
            oec r2 = r2.e
            dpa r2 = r2.c()
            r2.getClass()
            java.lang.String r11 = "SELECT phone, server_phone FROM phones"
            r12 = 0
            pec r11 = pec.a(r12, r11)
            aec r2 = r2.a
            r2.b()
            r12 = 0
            android.database.Cursor r2 = r2.o(r11, r12)
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0223 }
            int r14 = r2.getCount()     // Catch:{ all -> 0x0223 }
            r13.<init>(r14)     // Catch:{ all -> 0x0223 }
        L_0x01ff:
            boolean r14 = r2.moveToNext()     // Catch:{ all -> 0x0223 }
            if (r14 == 0) goto L_0x0226
            r14 = 0
            boolean r15 = r2.isNull(r14)     // Catch:{ all -> 0x0223 }
            if (r15 == 0) goto L_0x020f
            r15 = r12
        L_0x020d:
            r14 = 1
            goto L_0x0214
        L_0x020f:
            java.lang.String r15 = r2.getString(r14)     // Catch:{ all -> 0x0223 }
            goto L_0x020d
        L_0x0214:
            long r9 = r2.getLong(r14)     // Catch:{ all -> 0x0223 }
            coa r14 = new coa     // Catch:{ all -> 0x0223 }
            r14.<init>(r15, r9)     // Catch:{ all -> 0x0223 }
            r13.add(r14)     // Catch:{ all -> 0x0223 }
            r9 = 0
            goto L_0x01ff
        L_0x0223:
            r0 = move-exception
            goto L_0x0717
        L_0x0226:
            r2.close()
            r11.m()
            java.util.ArrayList r2 = new java.util.ArrayList
            r9 = 10
            int r9 = q23.H(r13, r9)
            r2.<init>(r9)
            java.util.Iterator r9 = r13.iterator()
        L_0x023b:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0258
            java.lang.Object r10 = r9.next()
            coa r10 = (defpackage.coa) r10
            xia r11 = new xia
            java.lang.String r13 = r10.a
            long r14 = r10.b
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            r11.<init>(r13, r10)
            r2.add(r11)
            goto L_0x023b
        L_0x0258:
            int r9 = r2.size()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>(r9)
            java.util.Iterator r2 = r2.iterator()
        L_0x0265:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0287
            java.lang.Object r9 = r2.next()
            r11 = r9
            xia r11 = (defpackage.xia) r11     // Catch:{ all -> 0x0280 }
            java.lang.Object r11 = r11.a     // Catch:{ all -> 0x0280 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0280 }
            xia r9 = (defpackage.xia) r9     // Catch:{ all -> 0x0280 }
            java.lang.Object r9 = r9.b     // Catch:{ all -> 0x0280 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0280 }
            r10.put(r11, r9)     // Catch:{ all -> 0x0280 }
            goto L_0x0265
        L_0x0280:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0287:
            g15 r2 = r1.j
            java.util.Collection r9 = xie.s(r7, r2)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0296:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x0314
            java.lang.Object r13 = r9.next()
            hoa r13 = (defpackage.hoa) r13
            java.lang.String r14 = r13.c
            java.lang.Object r14 = r10.get(r14)
            java.lang.Long r14 = (java.lang.Long) r14
            boolean r15 = r8.contains(r14)
            if (r15 == 0) goto L_0x02f6
            if (r14 == 0) goto L_0x02b7
            long r14 = r14.longValue()
            goto L_0x02b9
        L_0x02b7:
            r14 = 0
        L_0x02b9:
            r13.d = r14
            ioa r12 = new ioa
            r32 = r8
            r33 = r9
            long r8 = r13.a
            r34 = r10
            int r10 = r13.b
            r35 = r3
            java.lang.String r3 = r13.c
            r36 = r5
            java.lang.String r5 = r13.e
            r37 = r2
            java.lang.String r2 = r13.f
            r38 = r7
            java.lang.String r7 = r13.g
            int r13 = r13.h
            r19 = 0
            r27 = 0
            r18 = r12
            r21 = r8
            r23 = r10
            r24 = r3
            r25 = r14
            r28 = r5
            r29 = r2
            r30 = r7
            r31 = r13
            r18.<init>(r19, r21, r23, r24, r25, r27, r28, r29, r30, r31)
            r11.add(r12)
            goto L_0x0304
        L_0x02f6:
            r37 = r2
            r35 = r3
            r36 = r5
            r38 = r7
            r32 = r8
            r33 = r9
            r34 = r10
        L_0x0304:
            r8 = r32
            r9 = r33
            r10 = r34
            r3 = r35
            r5 = r36
            r2 = r37
            r7 = r38
            r12 = 0
            goto L_0x0296
        L_0x0314:
            r37 = r2
            r35 = r3
            r36 = r5
            r38 = r7
            xb4 r2 = new xb4
            r3 = 25
            r2.<init>(r3)
            java.util.Collections.sort(r11, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r3 = r11.iterator()
        L_0x032f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0345
            java.lang.Object r5 = r3.next()
            ioa r5 = (defpackage.ioa) r5
            long r7 = r5.Y
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r2.put(r7, r5)
            goto L_0x032f
        L_0x0345:
            java.util.Collection r2 = r2.values()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.Collection r7 = r0.values()
            java.util.Iterator r7 = r7.iterator()
        L_0x035b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x03cb
            java.lang.Object r8 = r7.next()
            tf3 r8 = (defpackage.tf3) r8
            boolean r9 = r2 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0372
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L_0x0372
            goto L_0x0397
        L_0x0372:
            java.util.Iterator r9 = r2.iterator()
        L_0x0376:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0397
            java.lang.Object r10 = r9.next()
            ioa r10 = (defpackage.ioa) r10     // Catch:{ all -> 0x0390 }
            long r10 = r10.Y     // Catch:{ all -> 0x0390 }
            long r12 = r8.o()     // Catch:{ all -> 0x0390 }
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x0376
            r3.add(r8)
            goto L_0x035b
        L_0x0390:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0397:
            boolean r9 = r6.isEmpty()
            if (r9 == 0) goto L_0x039e
            goto L_0x035b
        L_0x039e:
            java.util.Iterator r9 = r6.iterator()
        L_0x03a2:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x035b
            java.lang.Object r10 = r9.next()
            mae r10 = (defpackage.mae) r10     // Catch:{ all -> 0x03c4 }
            long r10 = r10.a     // Catch:{ all -> 0x03c4 }
            long r12 = r8.n()     // Catch:{ all -> 0x03c4 }
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x03a2
            long r8 = r8.n()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r5.add(r8)
            goto L_0x035b
        L_0x03c4:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x03cb:
            java.util.Iterator r7 = r6.iterator()
        L_0x03cf:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x03f1
            java.lang.Object r8 = r7.next()
            mae r8 = (defpackage.mae) r8
            long r9 = r8.a
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            boolean r9 = r0.containsKey(r9)
            if (r9 != 0) goto L_0x03cf
            long r8 = r8.a
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r5.add(r8)
            goto L_0x03cf
        L_0x03f1:
            r1.e(r5)
            int r0 = r3.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r5 = "updateContacts: count=%s"
            udd.p(r4, r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
            r12 = 0
        L_0x040b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x06f2
            java.lang.Object r0 = r3.next()
            r7 = r0
            tf3 r7 = (defpackage.tf3) r7
            sic r0 = new sic
            r8 = 24
            r0.<init>(r8, r7)
            java.util.List r0 = defpackage.ek8.s(r2, r0)
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L_0x042a
            goto L_0x040b
        L_0x042a:
            java.util.Iterator r8 = r6.iterator()
        L_0x042e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x044d
            java.lang.Object r9 = r8.next()
            r10 = r9
            mae r10 = (defpackage.mae) r10     // Catch:{ all -> 0x0446 }
            long r10 = r10.a     // Catch:{ all -> 0x0446 }
            long r13 = r7.n()     // Catch:{ all -> 0x0446 }
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x042e
            goto L_0x044e
        L_0x0446:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x044d:
            r9 = 0
        L_0x044e:
            mae r9 = (defpackage.mae) r9
            if (r9 == 0) goto L_0x06c1
            java.util.Iterator r8 = r0.iterator()
        L_0x0456:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0479
            java.lang.Object r10 = r8.next()
            r11 = r10
            ioa r11 = (defpackage.ioa) r11     // Catch:{ all -> 0x0472 }
            int r11 = r11.o     // Catch:{ all -> 0x0472 }
            long r13 = (long) r11     // Catch:{ all -> 0x0472 }
            r11 = r2
            r15 = r3
            long r2 = r9.c     // Catch:{ all -> 0x0472 }
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x046f
            goto L_0x047c
        L_0x046f:
            r2 = r11
            r3 = r15
            goto L_0x0456
        L_0x0472:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0479:
            r11 = r2
            r15 = r3
            r10 = 0
        L_0x047c:
            ioa r10 = (defpackage.ioa) r10
            if (r10 != 0) goto L_0x04b4
            java.lang.String r2 = "updateContacts: phoneDb for update not found, delete old entry and create it again"
            udd.q(r4, r2)
            long r2 = r7.n()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.Set r2 = java.util.Collections.singleton(r2)
            r1.e(r2)
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            ioa r0 = (defpackage.ioa) r0
            java.lang.String r2 = r0.w0
            java.lang.String r3 = r0.x0
            java.lang.String r0 = r0.X
            r1.d(r7, r2, r3, r0)
            r2 = 1
            int r12 = r12 + r2
            r3 = r2
            r9 = r4
            r24 = r6
            r25 = r11
            r32 = r12
            r30 = r15
            r12 = r38
            goto L_0x06b9
        L_0x04b4:
            java.lang.String r2 = r10.w0
            java.lang.String r3 = r10.x0
            java.lang.String r8 = r10.X
            java.lang.String r10 = "vnd.android.cursor.item/phone_v2"
            java.lang.String r13 = "vnd.android.cursor.item/name"
            android.content.ContentResolver r18 = r38.getContentResolver()
            android.net.Uri r0 = android.provider.ContactsContract.Data.CONTENT_URI
            android.net.Uri r19 = b(r0)
            java.lang.String r14 = "data1"
            r24 = r6
            java.lang.String r6 = "data2"
            r25 = r11
            java.lang.String r11 = "data3"
            java.lang.String r0 = "mimetype"
            java.lang.String[] r20 = new java.lang.String[]{r14, r6, r11, r0}
            java.lang.String r21 = "raw_contact_id = ?"
            r26 = r4
            r27 = r5
            long r4 = r9.b
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String[] r22 = new java.lang.String[]{r9}
            r23 = 0
            android.database.Cursor r9 = r18.query(r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x05f5 }
            if (r9 == 0) goto L_0x058a
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r28 = 0
            r29 = 0
        L_0x04fc:
            boolean r30 = r9.moveToNext()     // Catch:{ all -> 0x0584 }
            if (r30 == 0) goto L_0x0573
            r30 = r15
            int r15 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x056d }
            java.lang.String r15 = r9.getString(r15)     // Catch:{ all -> 0x056d }
            r31 = r0
            int r0 = defpackage.avb.tt_contact_mimetype     // Catch:{ all -> 0x056d }
            r32 = r12
            r12 = r38
            java.lang.String r0 = r12.getString(r0)     // Catch:{ all -> 0x0537 }
            boolean r0 = r1g.c(r15, r0)     // Catch:{ all -> 0x0537 }
            if (r0 == 0) goto L_0x053f
            int r0 = r9.getColumnIndex(r14)     // Catch:{ all -> 0x0537 }
            long r18 = r9.getLong(r0)     // Catch:{ all -> 0x0537 }
            int r0 = r9.getColumnIndex(r6)     // Catch:{ all -> 0x0537 }
            long r20 = r9.getLong(r0)     // Catch:{ all -> 0x0537 }
            int r0 = r9.getColumnIndex(r11)     // Catch:{ all -> 0x0537 }
            java.lang.String r22 = r9.getString(r0)     // Catch:{ all -> 0x0537 }
            goto L_0x0564
        L_0x0537:
            r0 = move-exception
        L_0x0538:
            r1 = r0
            r18 = r10
            r22 = r14
            goto L_0x05e9
        L_0x053f:
            boolean r0 = r1g.c(r15, r13)     // Catch:{ all -> 0x0537 }
            if (r0 == 0) goto L_0x0556
            int r0 = r9.getColumnIndex(r6)     // Catch:{ all -> 0x0537 }
            java.lang.String r23 = r9.getString(r0)     // Catch:{ all -> 0x0537 }
            int r0 = r9.getColumnIndex(r11)     // Catch:{ all -> 0x0537 }
            java.lang.String r28 = r9.getString(r0)     // Catch:{ all -> 0x0537 }
            goto L_0x0564
        L_0x0556:
            boolean r0 = r1g.c(r15, r10)     // Catch:{ all -> 0x0537 }
            if (r0 == 0) goto L_0x0564
            int r0 = r9.getColumnIndex(r14)     // Catch:{ all -> 0x0537 }
            java.lang.String r29 = r9.getString(r0)     // Catch:{ all -> 0x0537 }
        L_0x0564:
            r38 = r12
            r15 = r30
            r0 = r31
            r12 = r32
            goto L_0x04fc
        L_0x056d:
            r0 = move-exception
            r32 = r12
        L_0x0570:
            r12 = r38
            goto L_0x0538
        L_0x0573:
            r32 = r12
            r30 = r15
            r12 = r38
            r0 = r22
            r15 = r23
            r1 = r28
            r22 = r14
            r14 = r29
            goto L_0x059a
        L_0x0584:
            r0 = move-exception
            r32 = r12
            r30 = r15
            goto L_0x0570
        L_0x058a:
            r32 = r12
            r30 = r15
            r12 = r38
            r22 = r14
            r0 = 0
            r1 = 0
            r14 = 0
            r15 = 0
            r18 = 0
            r20 = 0
        L_0x059a:
            long r28 = r7.n()     // Catch:{ all -> 0x05dd }
            int r18 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r18 != 0) goto L_0x05da
            long r18 = r7.o()     // Catch:{ all -> 0x05dd }
            int r18 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r18 != 0) goto L_0x05da
            r18 = r10
            java.lang.String r10 = r7.d()     // Catch:{ all -> 0x05d7 }
            boolean r0 = r1g.c(r0, r10)     // Catch:{ all -> 0x05d7 }
            if (r0 == 0) goto L_0x05e1
            boolean r0 = r1g.c(r15, r2)     // Catch:{ all -> 0x05d7 }
            if (r0 == 0) goto L_0x05e1
            boolean r0 = r1g.c(r1, r3)     // Catch:{ all -> 0x05d7 }
            if (r0 == 0) goto L_0x05e1
            boolean r0 = r1g.c(r14, r8)     // Catch:{ all -> 0x05d7 }
            if (r0 == 0) goto L_0x05e1
            if (r9 == 0) goto L_0x05d0
            r9.close()     // Catch:{ Exception -> 0x05ce }
            goto L_0x05d0
        L_0x05ce:
            r0 = move-exception
            goto L_0x0600
        L_0x05d0:
            r9 = r26
            r5 = r27
            r3 = 1
            goto L_0x06b9
        L_0x05d7:
            r0 = move-exception
        L_0x05d8:
            r1 = r0
            goto L_0x05e9
        L_0x05da:
            r18 = r10
            goto L_0x05e1
        L_0x05dd:
            r0 = move-exception
            r18 = r10
            goto L_0x05d8
        L_0x05e1:
            if (r9 == 0) goto L_0x05e6
            r9.close()     // Catch:{ Exception -> 0x05ce }
        L_0x05e6:
            r9 = r26
            goto L_0x0607
        L_0x05e9:
            if (r9 == 0) goto L_0x05f4
            r9.close()     // Catch:{ all -> 0x05ef }
            goto L_0x05f4
        L_0x05ef:
            r0 = move-exception
            r9 = r0
            r1.addSuppressed(r9)     // Catch:{ Exception -> 0x05ce }
        L_0x05f4:
            throw r1     // Catch:{ Exception -> 0x05ce }
        L_0x05f5:
            r0 = move-exception
            r18 = r10
            r32 = r12
            r22 = r14
            r30 = r15
            r12 = r38
        L_0x0600:
            java.lang.String r1 = "needUpdate: exception"
            r9 = r26
            udd.s(r9, r1, r0)
        L_0x0607:
            android.content.ContentResolver r0 = r12.getContentResolver()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.Uri r10 = android.provider.ContactsContract.Data.CONTENT_URI
            android.net.Uri r14 = b(r10)
            android.content.ContentProviderOperation$Builder r14 = android.content.ContentProviderOperation.newUpdate(r14)
            java.lang.String r15 = java.lang.String.valueOf(r4)
            java.lang.String[] r13 = new java.lang.String[]{r15, r13}
            java.lang.String r15 = "raw_contact_id = ? AND mimetype =?"
            android.content.ContentProviderOperation$Builder r13 = r14.withSelection(r15, r13)
            android.content.ContentProviderOperation$Builder r2 = r13.withValue(r6, r2)
            android.content.ContentProviderOperation$Builder r2 = r2.withValue(r11, r3)
            android.content.ContentProviderOperation r2 = r2.build()
            r1.add(r2)
            android.net.Uri r2 = b(r10)
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newUpdate(r2)
            java.lang.String r3 = java.lang.String.valueOf(r4)
            r13 = r18
            java.lang.String[] r3 = new java.lang.String[]{r3, r13}
            android.content.ContentProviderOperation$Builder r2 = r2.withSelection(r15, r3)
            r3 = r22
            android.content.ContentProviderOperation$Builder r2 = r2.withValue(r3, r8)
            android.content.ContentProviderOperation r2 = r2.build()
            r1.add(r2)
            android.net.Uri r2 = b(r10)
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newUpdate(r2)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = defpackage.avb.tt_contact_mimetype
            java.lang.String r5 = r12.getString(r5)
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.lang.String r5 = "raw_contact_id = ? AND mimetype = ?"
            android.content.ContentProviderOperation$Builder r2 = r2.withSelection(r5, r4)
            long r4 = r7.n()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            android.content.ContentProviderOperation$Builder r2 = r2.withValue(r3, r4)
            long r3 = r7.o()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            android.content.ContentProviderOperation$Builder r2 = r2.withValue(r6, r3)
            java.lang.String r3 = r7.d()
            android.content.ContentProviderOperation$Builder r2 = r2.withValue(r11, r3)
            android.content.ContentProviderOperation r2 = r2.build()
            r1.add(r2)
            java.lang.String r2 = "com.android.contacts"
            r0.applyBatch(r2, r1)     // Catch:{ Exception -> 0x06a4 }
            r3 = 1
            goto L_0x06b7
        L_0x06a4:
            r0 = move-exception
            java.lang.String r1 = "Exception when update for contact our mime type"
            udd.s(r9, r1, r0)
            ru.ok.tamtam.util.HandledException r1 = new ru.ok.tamtam.util.HandledException
            r1.<init>(r0)
            r2 = r37
            r4a r2 = (r4a) r2
            r3 = 1
            r2.c(r1, r3)
        L_0x06b7:
            int r5 = r27 + 1
        L_0x06b9:
            r1 = 0
            r27 = r5
            r0 = r32
            r5 = r39
            goto L_0x06e3
        L_0x06c1:
            r25 = r2
            r30 = r3
            r9 = r4
            r27 = r5
            r24 = r6
            r32 = r12
            r12 = r38
            r1 = 0
            r3 = 1
            java.lang.Object r0 = r0.get(r1)
            ioa r0 = (defpackage.ioa) r0
            java.lang.String r2 = r0.w0
            java.lang.String r4 = r0.x0
            java.lang.String r0 = r0.X
            r5 = r39
            r5.d(r7, r2, r4, r0)
            int r0 = r32 + 1
        L_0x06e3:
            r1 = r5
            r4 = r9
            r38 = r12
            r6 = r24
            r2 = r25
            r5 = r27
            r3 = r30
            r12 = r0
            goto L_0x040b
        L_0x06f2:
            r9 = r4
            r27 = r5
            r32 = r12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r32)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "updateContacts: inserted=%s, updated=%s"
            udd.p(r9, r1, r0)
            if (r41 == 0) goto L_0x0716
            r5 = r36
            j2b r5 = (defpackage.j2b) r5
            i03 r0 = r5.a
            r1 = r35
            r2 = 1
            r0.i(r1, r2)
        L_0x0716:
            return
        L_0x0717:
            r2.close()
            r11.m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nae.g(java.util.Collection, boolean):void");
    }
}
