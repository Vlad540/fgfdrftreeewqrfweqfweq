package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: zj7  reason: default package */
public final class zj7 extends jk7 {
    public final /* synthetic */ int c;
    public final ContentResolver d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zj7(Executor executor, qe4 qe4, ContentResolver contentResolver, int i) {
        super(executor, qe4);
        this.c = i;
        this.d = contentResolver;
    }

    public final ax4 d(tr6 tr6) {
        ax4 ax4;
        InputStream inputStream;
        ContentResolver contentResolver = this.d;
        switch (this.c) {
            case 0:
                Uri uri = tr6.b;
                Uri uri2 = fye.a;
                if (uri.getPath() != null && "content".equals(fye.b(uri)) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(fye.a.getPath())) {
                    if (uri.toString().endsWith("/photo")) {
                        inputStream = contentResolver.openInputStream(uri);
                    } else if (uri.toString().endsWith("/display_photo")) {
                        try {
                            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                            if (openAssetFileDescriptor != null) {
                                inputStream = openAssetFileDescriptor.createInputStream();
                            } else {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                        } catch (IOException unused) {
                            throw new IOException("Contact photo does not exist: " + uri);
                        }
                    } else {
                        InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
                        if (openContactPhotoInputStream != null) {
                            inputStream = openContactPhotoInputStream;
                        } else {
                            throw new IOException("Contact photo does not exist: " + uri);
                        }
                    }
                    if (inputStream != null) {
                        return c(inputStream, -1);
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (fye.d(uri)) {
                    try {
                        ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                        if (openFileDescriptor != null) {
                            ax4 c2 = c(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
                            openFileDescriptor.close();
                            ax4 = c2;
                            if (ax4 != null) {
                                return ax4;
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    } catch (FileNotFoundException unused2) {
                        ax4 = null;
                    }
                }
                InputStream openInputStream = contentResolver.openInputStream(uri);
                if (openInputStream != null) {
                    return c(openInputStream, -1);
                }
                throw new IllegalStateException("Required value was null.".toString());
            default:
                InputStream openInputStream2 = contentResolver.openInputStream(tr6.b);
                if (openInputStream2 != null) {
                    return c(openInputStream2, -1);
                }
                throw new IllegalStateException("ContentResolver returned null InputStream".toString());
        }
    }

    public final String e() {
        switch (this.c) {
            case 0:
                return "LocalContentUriFetchProducer";
            default:
                return "QualifiedResourceFetchProducer";
        }
    }
}
