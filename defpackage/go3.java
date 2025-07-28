package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;

/* renamed from: go3  reason: default package */
public final /* synthetic */ class go3 implements e8 {
    public final void a(sgc sgc) {
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/raw_contact");
        intent.putExtra("finishActivityOnSaveCompleted", true);
        try {
            jjd.C(sgc).startActivityForResult(intent, 102);
        } catch (ActivityNotFoundException unused) {
            udd.s("ContactsDeepLinkFactory", "createContact: failed, no activity found", (Throwable) null);
        }
    }
}
