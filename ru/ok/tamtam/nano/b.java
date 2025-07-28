package ru.ok.tamtam.nano;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;

public abstract class b {
    public static final byte[] a = new byte[0];

    /* JADX WARNING: type inference failed for: r0v2, types: [mt7, java.lang.Object] */
    static {
        xy6.d = new Object();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [w52, java.lang.Object] */
    public static HashMap a(Map map) {
        HashMap hashMap = new HashMap(map.size());
        for (Long l : map.keySet()) {
            Protos.Chat.AdminParticipant adminParticipant = (Protos.Chat.AdminParticipant) map.get(l);
            ? obj = new Object();
            obj.b = adminParticipant.id;
            obj.a = adminParticipant.permissions;
            obj.c = adminParticipant.inviterId;
            obj.d = adminParticipant.alias;
            hashMap.put(l, new x52(obj));
        }
        return hashMap;
    }

    public static int b(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 1 : 6;
        }
        return 5;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r5v7, types: [w00, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v9, types: [b10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v10, types: [p00, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v11, types: [u00, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v17, types: [i00, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v19, types: [e10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v21, types: [h10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v56, types: [java.lang.Object, k00] */
    /* JADX WARNING: type inference failed for: r9v77, types: [r00, java.lang.Object] */
    public static o10 c(Protos.Attaches.Attach attach) {
        m00 m00;
        m00 m002;
        List list;
        int lastIndexOf;
        int i;
        int i2;
        Protos.Attaches.Attach attach2 = attach;
        int i3 = o10.z;
        ? obj = new Object();
        obj.j = attach2.lastErrorTime;
        float f = attach2.progressFloat;
        if (f == 0.0f) {
            f = (float) attach2.progress;
        }
        obj.k = f;
        obj.l = attach2.localId;
        obj.m = attach2.localPath;
        obj.n = attach2.isDeleted;
        obj.o = attach2.totalBytes;
        obj.p = attach2.bytesDownloaded;
        obj.u = attach2.lastModified;
        obj.x = attach2.sensitiveContentUnlocked;
        obj.y = attach2.sensitive;
        int i4 = attach2.type;
        j10 j10 = j10.a;
        switch (i4) {
            case 1:
                j10 = j10.b;
                break;
            case 2:
                j10 = j10.c;
                break;
            case 3:
                j10 = j10.o;
                break;
            case 4:
                j10 = j10.X;
                break;
            case 5:
                j10 = j10.Y;
                break;
            case 6:
                j10 = j10.Z;
                break;
            case 7:
                j10 = j10.x0;
                break;
            case 8:
                j10 = j10.w0;
                break;
            case 10:
                j10 = j10.y0;
                break;
            case 11:
                j10 = j10.z0;
                break;
            case Protos.Attaches.Attach.PRESENT:
                j10 = j10.A0;
                break;
            case Protos.Attaches.Attach.LOCATION:
                j10 = j10.B0;
                break;
        }
        obj.a = j10;
        int i5 = attach2.status;
        g10 g10 = g10.a;
        int i6 = 4;
        if (i5 != 0) {
            if (i5 == 1) {
                g10 = g10.b;
            } else if (i5 == 2) {
                g10 = g10.c;
            } else if (i5 == 3) {
                g10 = g10.o;
            } else if (i5 == 4) {
                g10 = g10.X;
            }
        }
        obj.i = g10;
        Protos.Attaches.Attach.Photo photo = attach2.photo;
        if (photo != null) {
            obj.b = m(photo);
        }
        Protos.Attaches.Attach.Control control = attach2.control;
        if (control != null) {
            int i7 = t00.p;
            ? obj2 = new Object();
            int i8 = control.event;
            s00 s00 = s00.a;
            switch (i8) {
                case 1:
                    s00 = s00.b;
                    break;
                case 2:
                    s00 = s00.c;
                    break;
                case 3:
                    s00 = s00.o;
                    break;
                case 4:
                    s00 = s00.X;
                    break;
                case 5:
                    s00 = s00.Y;
                    break;
                case 6:
                    s00 = s00.Z;
                    break;
                case 7:
                case 8:
                    s00 = s00.w0;
                    break;
                case 9:
                    s00 = s00.x0;
                    break;
                case 10:
                    s00 = s00.y0;
                    break;
                case 11:
                    s00 = s00.z0;
                    break;
            }
            obj2.a = s00;
            obj2.b = control.userId;
            obj2.c = ek8.m(control.userIds);
            Protos.Attaches.Attach.Control control2 = attach2.control;
            obj2.d = control2.title;
            obj2.e = control2.iconToken;
            obj2.f = control2.url;
            obj2.g = control2.fullUrl;
            obj2.k = control2.showHistory;
            int i9 = control2.chatType;
            if (i9 == 1) {
                obj2.l = 3;
            } else if (i9 == 2) {
                obj2.l = 4;
            } else if (i9 == 3) {
                obj2.l = 5;
            } else if (i9 != 4) {
                obj2.l = 1;
            } else {
                obj2.l = 2;
            }
            Protos.Attaches.Attach.Rect rect = control2.crop;
            if (rect != null) {
                d10 d10 = r11;
                d10 d102 = new d10(rect.left, rect.top, rect.right, rect.bottom, 0);
                obj2.h = d10;
            }
            obj2.i = control2.message;
            obj2.j = control2.shortMessage;
            obj2.m = control2.pinnedMessageId;
            obj2.n = control2.pinnedMessageServerId;
            obj2.o = control2.startPayload;
            obj.c = obj2.a();
        }
        Protos.Attaches.Attach.Video video = attach2.video;
        if (video != null) {
            n10 n10 = n10.r;
            k10 k10 = new k10();
            k10.a = video.videoId;
            int i10 = video.videoType;
            int[] w = hr1.w(2);
            int length = w.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    i2 = w[i11];
                    if (hr1.t(i2) != i10) {
                        i11++;
                    }
                } else {
                    i2 = 1;
                }
            }
            k10.q = i2;
            Protos.Attaches.Attach.Video video2 = attach2.video;
            k10.b = (long) video2.duration;
            k10.c = video2.thumbnail;
            k10.d = video2.width;
            k10.e = video2.height;
            k10.f = video2.live;
            k10.g = video2.externalUrl;
            k10.h = video2.externalSiteName;
            k10.i = video2.previewData;
            k10.j = video2.startTime;
            k10.l = video2.token;
            k10.n = video2.ignoreAutoplay;
            k10.o = video2.audioTrackIndex;
            k10.p = video2.audioGroupIndex;
            Protos.Attaches.Attach.Video.ConvertOptions convertOptions = video2.convertOptions;
            if (convertOptions != null) {
                int i12 = m10.e;
                l10 l10 = new l10(0);
                l10.b = convertOptions.startTrimPosition;
                l10.c = convertOptions.endTrimPosition;
                l10.d = convertOptions.mute;
                if (convertOptions.quality != null) {
                    l10.a = qjb.values()[attach2.video.convertOptions.quality.ordinal];
                } else {
                    l10.a = qjb.values()[attach2.video.convertOptions.qualityValue];
                }
                k10.k = new m10(l10);
            }
            Protos.Attaches.Attach.Video.VideoCollage videoCollage = attach2.video.videoCollage;
            if (videoCollage != null) {
                k10.m = new xx(videoCollage.frequency, videoCollage.height, videoCollage.width, videoCollage.count, videoCollage.url);
            }
            obj.d = new n10(k10);
        }
        Protos.Attaches.Attach.Audio audio = attach2.audio;
        if (audio != null) {
            int i13 = audio.transcriptionStatus;
            if (i13 != 0) {
                if (i13 == 1) {
                    i = 2;
                } else if (i13 == 2) {
                    i = 3;
                } else if (i13 == 3) {
                    i = 4;
                } else if (i13 == 4) {
                    i = 5;
                }
                l00 l00 = l00.j;
                ? obj3 = new Object();
                obj3.a = audio.audioId;
                obj3.b = audio.url;
                obj3.c = audio.duration;
                obj3.g = audio.startTime;
                obj3.h = audio.lastStartTimeUpdateTimestamp;
                obj3.d = audio.wave;
                obj3.f = audio.transcription;
                obj3.i = i;
                obj3.e = audio.token;
                obj.e = new l00(obj3);
            }
            i = 1;
            l00 l002 = l00.j;
            ? obj32 = new Object();
            obj32.a = audio.audioId;
            obj32.b = audio.url;
            obj32.c = audio.duration;
            obj32.g = audio.startTime;
            obj32.h = audio.lastStartTimeUpdateTimestamp;
            obj32.d = audio.wave;
            obj32.f = audio.transcription;
            obj32.i = i;
            obj32.e = audio.token;
            obj.e = new l00(obj32);
        }
        Protos.Attaches.Attach.Sticker sticker = attach2.sticker;
        if (sticker != null) {
            i10 i102 = i10.p;
            ? obj4 = new Object();
            obj4.a = sticker.stickerId;
            obj4.d = sticker.url;
            obj4.b = sticker.width;
            obj4.c = sticker.height;
            obj4.f = sticker.mp4Url;
            obj4.g = sticker.firstUrl;
            String[] strArr = sticker.tags;
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, strArr);
            obj4.i = arrayList;
            Protos.Attaches.Attach.Sticker sticker2 = attach2.sticker;
            obj4.h = sticker2.previewUrl;
            obj4.e = sticker2.updateTime;
            obj4.k = sticker2.setId;
            obj4.l = sticker2.lottieUrl;
            obj4.o = sticker2.videoUrl;
            obj4.m = sticker2.audio;
            int i14 = sticker2.stickerType;
            if (i14 == 1) {
                obj4.j = 2;
            } else if (i14 == 2) {
                obj4.j = 3;
            } else if (i14 != 4) {
                obj4.j = 1;
            } else {
                obj4.j = 4;
            }
            int i15 = sticker2.authorType;
            if (i15 == 1) {
                obj4.n = 2;
            } else if (i15 != 2) {
                obj4.n = 1;
            } else {
                obj4.n = 3;
            }
            obj.f = obj4.a();
        }
        Protos.Attaches.Attach.Share share = attach2.share;
        if (share != null) {
            int i16 = f10.i;
            ? obj5 = new Object();
            obj5.a = share.shareId;
            obj5.b = share.url;
            obj5.c = share.title;
            obj5.d = share.description;
            obj5.e = share.host;
            Protos.Attaches.Attach.Photo photo2 = share.image;
            if (photo2 != null) {
                obj5.f = m(photo2);
            }
            Protos.Attaches.Attach attach3 = attach2.share.media;
            if (attach3 != null) {
                obj5.g = c(attach3);
            }
            obj5.h = attach2.share.deleted;
            obj.g = new f10(obj5);
        }
        Protos.Attaches.Attach.App app = attach2.app;
        if (app != null) {
            ? obj6 = new Object();
            obj6.a = app.appId;
            obj6.b = app.name;
            obj6.d = app.message;
            obj6.c = app.icon;
            obj6.f = app.timeout;
            obj6.e = app.state;
            obj6.g = app.appState;
            obj.h = new j00(obj6);
        }
        Protos.Attaches.Attach.Call call = attach2.call;
        if (call != null) {
            int i17 = call.callType;
            int i18 = i17 != 1 ? i17 != 2 ? 1 : 3 : 2;
            int i19 = call.hangupType;
            int i20 = i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 4 ? 1 : 5 : 4 : 3 : 2;
            long j = call.durationLong;
            if (j == 0) {
                j = (long) call.duration;
            }
            n00 n00 = new n00();
            n00.a = call.conversationId;
            n00.c = call.joinLink;
            n00.d = i18;
            n00.f = i20;
            n00.b = j;
            ArrayList m = ek8.m(call.contactIds);
            n00.e = m;
            if (m == null) {
                n00.e = Collections.emptyList();
            }
            obj.q = new o00(n00);
        }
        Protos.Attaches.Attach.File file = attach2.file;
        if (file != null) {
            ? obj7 = new Object();
            obj7.a = file.fileId;
            obj7.b = file.size;
            String str = file.name;
            if (!r1g.p(str) && (lastIndexOf = str.lastIndexOf("/")) != -1) {
                str = str.substring(lastIndexOf + 1);
            }
            obj7.c = str;
            Protos.Attaches.Attach attach4 = attach2.file.preview;
            obj7.e = attach4 != null ? c(attach4) : null;
            obj7.d = attach2.file.token;
            obj.r = new v00(obj7);
        }
        Protos.Attaches.Attach.Contact contact = attach2.contact;
        if (contact != null) {
            ? obj8 = new Object();
            obj8.a = contact.vcfBody;
            obj8.b = contact.contactId;
            obj8.c = contact.name;
            obj8.f = contact.phone;
            obj8.g = contact.photoUrl;
            obj8.h = contact.localPhotoUrl;
            obj8.d = contact.firstName;
            obj8.e = contact.lastName;
            obj.s = new q00(obj8);
        }
        Protos.Attaches.Attach.Present present = attach2.present;
        if (present != null) {
            int i21 = present.status;
            if (i21 == 1) {
                i6 = 2;
            } else if (i21 == 2) {
                i6 = 3;
            } else if (i21 != 3) {
                if (i21 != 4) {
                    i6 = 5;
                    if (i21 != 5) {
                        i6 = 1;
                    }
                } else {
                    i6 = 6;
                }
            }
            ? obj9 = new Object();
            obj9.a = present.presentId;
            obj9.b = present.metadataId;
            obj9.c = present.senderId;
            obj9.d = present.receiverId;
            obj9.e = i6;
            obj9.f = present.presentJson;
            obj.t = new b10(obj9);
        }
        Protos.Attaches.Attach.Location location = attach2.location;
        if (location != null) {
            ? obj10 = new Object();
            obj10.a = new dm7(location.latitude, location.longitude, location.altitude, location.accuracy, location.bearing, location.speed);
            obj10.b = location.livePeriod;
            obj10.c = location.startTime;
            obj10.d = location.endTime;
            Protos.Attaches.LocationInfo[] locationInfoArr = location.track;
            if (locationInfoArr == null) {
                list = Collections.emptyList();
                m002 = obj;
            } else {
                ArrayList arrayList2 = new ArrayList(locationInfoArr.length);
                int length2 = locationInfoArr.length;
                int i22 = 0;
                m00 m003 = obj;
                while (i22 < length2) {
                    Protos.Attaches.LocationInfo locationInfo = locationInfoArr[i22];
                    dm7 dm7 = r12;
                    dm7 dm72 = new dm7(locationInfo.latitude, locationInfo.longitude, locationInfo.altitude, locationInfo.accuracy, locationInfo.bearing, locationInfo.speed);
                    arrayList2.add(new y00(dm7, locationInfo.time));
                    i22++;
                    m003 = m003;
                    locationInfoArr = locationInfoArr;
                    length2 = length2;
                    Protos.Attaches.Attach attach5 = attach;
                }
                m002 = m003;
                list = arrayList2;
            }
            obj10.e = list;
            obj10.f = location.deviceId;
            obj10.g = location.zoom;
            obj10.h = location.corrupted;
            Protos.Attaches.LocationInfo locationInfo2 = location.lastLocation;
            if (locationInfo2 != null) {
                obj10.i = new y00(new dm7(locationInfo2.latitude, locationInfo2.longitude, locationInfo2.altitude, locationInfo2.accuracy, locationInfo2.bearing, locationInfo2.speed), locationInfo2.time);
            }
            m00 = m002;
            m00.v = obj10.a();
        } else {
            m00 = obj;
        }
        int i23 = attach.processingOnServerStatus;
        m00.w = i23 != 1 ? i23 != 2 ? c10.a : c10.c : c10.b;
        return m00.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ru.ok.tamtam.nano.Protos.Attaches.Attach d(defpackage.o10 r15) {
        /*
            r0 = 1
            ru.ok.tamtam.nano.Protos$Attaches$Attach r1 = new ru.ok.tamtam.nano.Protos$Attaches$Attach
            r1.<init>()
            long r2 = r15.o
            r1.lastErrorTime = r2
            float r2 = r15.p
            r1.progressFloat = r2
            r2 = 0
            r1.progress = r2
            java.lang.String r3 = r15.q
            boolean r4 = r1g.p(r3)
            if (r4 == 0) goto L_0x0021
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
        L_0x0021:
            r1.localId = r3
            java.lang.String r3 = ""
            java.lang.String r4 = r15.r
            if (r4 != 0) goto L_0x002a
            r4 = r3
        L_0x002a:
            r1.localPath = r4
            boolean r4 = r15.s
            r1.isDeleted = r4
            long r4 = r15.t
            r1.totalBytes = r4
            long r4 = r15.u
            r1.bytesDownloaded = r4
            long r4 = r15.v
            r1.lastModified = r4
            boolean r4 = r15.x
            r1.sensitiveContentUnlocked = r4
            boolean r4 = r15.y
            r1.sensitive = r4
            j10 r4 = r15.a
            int r4 = r4.ordinal()
            r5 = 6
            r6 = 8
            r7 = 10
            r8 = 11
            r9 = 5
            r10 = 3
            r11 = 4
            r12 = 2
            switch(r4) {
                case 1: goto L_0x0072;
                case 2: goto L_0x0070;
                case 3: goto L_0x006e;
                case 4: goto L_0x006c;
                case 5: goto L_0x006a;
                case 6: goto L_0x0068;
                case 7: goto L_0x0066;
                case 8: goto L_0x0064;
                case 9: goto L_0x0062;
                case 10: goto L_0x0060;
                case 11: goto L_0x005d;
                case 12: goto L_0x005a;
                default: goto L_0x0058;
            }
        L_0x0058:
            r4 = r2
            goto L_0x0073
        L_0x005a:
            r4 = 14
            goto L_0x0073
        L_0x005d:
            r4 = 12
            goto L_0x0073
        L_0x0060:
            r4 = r8
            goto L_0x0073
        L_0x0062:
            r4 = r7
            goto L_0x0073
        L_0x0064:
            r4 = 7
            goto L_0x0073
        L_0x0066:
            r4 = r6
            goto L_0x0073
        L_0x0068:
            r4 = r5
            goto L_0x0073
        L_0x006a:
            r4 = r9
            goto L_0x0073
        L_0x006c:
            r4 = r11
            goto L_0x0073
        L_0x006e:
            r4 = r10
            goto L_0x0073
        L_0x0070:
            r4 = r12
            goto L_0x0073
        L_0x0072:
            r4 = r0
        L_0x0073:
            r1.type = r4
            g10 r4 = r15.n
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x0085
            if (r4 == r0) goto L_0x008d
            if (r4 == r12) goto L_0x008b
            if (r4 == r10) goto L_0x0089
            if (r4 == r11) goto L_0x0087
        L_0x0085:
            r4 = r2
            goto L_0x008e
        L_0x0087:
            r4 = r11
            goto L_0x008e
        L_0x0089:
            r4 = r10
            goto L_0x008e
        L_0x008b:
            r4 = r12
            goto L_0x008e
        L_0x008d:
            r4 = r0
        L_0x008e:
            r1.status = r4
            boolean r4 = r15.f()
            if (r4 == 0) goto L_0x009e
            a10 r4 = r15.b
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Photo r4 = n(r4)
            r1.photo = r4
        L_0x009e:
            t00 r4 = r15.c
            if (r4 == 0) goto L_0x014a
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Control r13 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Control
            r13.<init>()
            s00 r14 = r4.a
            int r14 = r14.ordinal()
            switch(r14) {
                case 1: goto L_0x00c3;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00bf;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00bb;
                case 6: goto L_0x00c4;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00b6;
                case 9: goto L_0x00b4;
                case 10: goto L_0x00b2;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            r5 = r2
            goto L_0x00c4
        L_0x00b2:
            r5 = r8
            goto L_0x00c4
        L_0x00b4:
            r5 = r7
            goto L_0x00c4
        L_0x00b6:
            r5 = 9
            goto L_0x00c4
        L_0x00b9:
            r5 = r6
            goto L_0x00c4
        L_0x00bb:
            r5 = r9
            goto L_0x00c4
        L_0x00bd:
            r5 = r11
            goto L_0x00c4
        L_0x00bf:
            r5 = r10
            goto L_0x00c4
        L_0x00c1:
            r5 = r12
            goto L_0x00c4
        L_0x00c3:
            r5 = r0
        L_0x00c4:
            r13.event = r5
            long r5 = r4.b
            r13.userId = r5
            java.util.ArrayList r5 = r4.c
            long[] r5 = defpackage.ek8.n(r5)
            r13.userIds = r5
            java.lang.String r5 = r4.d
            if (r5 != 0) goto L_0x00d7
            r5 = r3
        L_0x00d7:
            r13.title = r5
            java.lang.String r5 = r4.e
            if (r5 != 0) goto L_0x00de
            r5 = r3
        L_0x00de:
            r13.iconToken = r5
            java.lang.String r5 = r4.f
            if (r5 != 0) goto L_0x00e5
            r5 = r3
        L_0x00e5:
            r13.url = r5
            java.lang.String r5 = r4.g
            if (r5 != 0) goto L_0x00ec
            r5 = r3
        L_0x00ec:
            r13.fullUrl = r5
            d10 r5 = r4.h
            if (r5 == 0) goto L_0x0109
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Rect r6 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Rect
            r6.<init>()
            r13.crop = r6
            float r7 = r5.b
            r6.left = r7
            float r7 = r5.c
            r6.top = r7
            float r7 = r5.d
            r6.right = r7
            float r5 = r5.e
            r6.bottom = r5
        L_0x0109:
            java.lang.String r5 = r4.i
            if (r5 != 0) goto L_0x010e
            r5 = r3
        L_0x010e:
            r13.message = r5
            java.lang.String r5 = r4.j
            if (r5 != 0) goto L_0x0115
            r5 = r3
        L_0x0115:
            r13.shortMessage = r5
            boolean r5 = r4.k
            r13.showHistory = r5
            int r5 = r4.l
            if (r5 == 0) goto L_0x0139
            int r5 = hr1.t(r5)
            if (r5 == r0) goto L_0x0137
            if (r5 == r12) goto L_0x0134
            if (r5 == r10) goto L_0x0131
            if (r5 == r11) goto L_0x012e
            r13.chatType = r2
            goto L_0x0139
        L_0x012e:
            r13.chatType = r10
            goto L_0x0139
        L_0x0131:
            r13.chatType = r12
            goto L_0x0139
        L_0x0134:
            r13.chatType = r0
            goto L_0x0139
        L_0x0137:
            r13.chatType = r11
        L_0x0139:
            long r5 = r4.m
            r13.pinnedMessageId = r5
            long r5 = r4.n
            r13.pinnedMessageServerId = r5
            java.lang.String r4 = r4.o
            if (r4 != 0) goto L_0x0146
            r4 = r3
        L_0x0146:
            r13.startPayload = r4
            r1.control = r13
        L_0x014a:
            boolean r4 = r15.i()
            if (r4 == 0) goto L_0x01e6
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Video r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Video
            r4.<init>()
            n10 r5 = r15.d
            long r6 = r5.a
            r4.videoId = r6
            int r6 = r5.b
            int r6 = hr1.t(r6)
            r4.videoType = r6
            long r6 = r5.c
            int r6 = (int) r6
            r4.duration = r6
            java.lang.String r6 = r5.d
            if (r6 != 0) goto L_0x016d
            r6 = r3
        L_0x016d:
            r4.thumbnail = r6
            int r6 = r5.e
            r4.width = r6
            int r6 = r5.f
            r4.height = r6
            boolean r6 = r5.g
            r4.live = r6
            java.lang.String r6 = r5.h
            if (r6 != 0) goto L_0x0180
            r6 = r3
        L_0x0180:
            r4.externalUrl = r6
            java.lang.String r6 = r5.i
            if (r6 != 0) goto L_0x0187
            r6 = r3
        L_0x0187:
            r4.externalSiteName = r6
            byte[] r6 = r5.j
            if (r6 == 0) goto L_0x018f
            r4.previewData = r6
        L_0x018f:
            long r6 = r5.k
            r4.startTime = r6
            java.lang.String r6 = r5.m
            if (r6 != 0) goto L_0x0198
            r6 = r3
        L_0x0198:
            r4.token = r6
            boolean r6 = r5.o
            r4.ignoreAutoplay = r6
            int r6 = r5.p
            r4.audioTrackIndex = r6
            int r6 = r5.q
            r4.audioGroupIndex = r6
            m10 r6 = r5.l
            if (r6 == 0) goto L_0x01c3
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Video$ConvertOptions r7 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Video$ConvertOptions
            r7.<init>()
            float r8 = r6.a
            r7.startTrimPosition = r8
            float r8 = r6.b
            r7.endTrimPosition = r8
            qjb r8 = r6.c
            int r8 = r8.b
            r7.qualityValue = r8
            boolean r6 = r6.d
            r7.mute = r6
            r4.convertOptions = r7
        L_0x01c3:
            xx r5 = r5.n
            if (r5 == 0) goto L_0x01e4
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Video$VideoCollage r6 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Video$VideoCollage
            r6.<init>()
            java.lang.Object r7 = r5.Y
            java.lang.String r7 = (java.lang.String) r7
            r6.url = r7
            int r7 = r5.b
            r6.frequency = r7
            int r7 = r5.c
            r6.height = r7
            int r7 = r5.o
            r6.width = r7
            int r5 = r5.X
            r6.count = r5
            r4.videoCollage = r6
        L_0x01e4:
            r1.video = r4
        L_0x01e6:
            boolean r4 = r15.a()
            if (r4 == 0) goto L_0x0242
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Audio r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Audio
            r4.<init>()
            l00 r5 = r15.e
            long r6 = r5.a
            r4.audioId = r6
            java.lang.String r6 = r5.b
            if (r6 != 0) goto L_0x01fc
            r6 = r3
        L_0x01fc:
            r4.url = r6
            long r6 = r5.c
            r4.duration = r6
            byte[] r6 = r5.d
            if (r6 == 0) goto L_0x0208
            r4.wave = r6
        L_0x0208:
            java.lang.String r6 = r5.f
            if (r6 == 0) goto L_0x020e
            r4.transcription = r6
        L_0x020e:
            int r6 = r5.i
            if (r6 == 0) goto L_0x0231
            int r6 = hr1.t(r6)
            if (r6 == 0) goto L_0x022f
            if (r6 == r0) goto L_0x022c
            if (r6 == r12) goto L_0x0229
            if (r6 == r10) goto L_0x0226
            if (r6 == r11) goto L_0x0223
            r4.transcriptionStatus = r2
            goto L_0x0231
        L_0x0223:
            r4.transcriptionStatus = r11
            goto L_0x0231
        L_0x0226:
            r4.transcriptionStatus = r10
            goto L_0x0231
        L_0x0229:
            r4.transcriptionStatus = r12
            goto L_0x0231
        L_0x022c:
            r4.transcriptionStatus = r0
            goto L_0x0231
        L_0x022f:
            r4.transcriptionStatus = r2
        L_0x0231:
            java.lang.String r6 = r5.e
            if (r6 != 0) goto L_0x0236
            r6 = r3
        L_0x0236:
            r4.token = r6
            long r6 = r5.g
            r4.startTime = r6
            long r5 = r5.h
            r4.lastStartTimeUpdateTimestamp = r5
            r1.audio = r4
        L_0x0242:
            boolean r4 = r15.h()
            if (r4 == 0) goto L_0x02cd
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Sticker r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Sticker
            r4.<init>()
            i10 r5 = r15.f
            long r6 = r5.a
            r4.stickerId = r6
            java.lang.String r6 = r5.b
            if (r6 != 0) goto L_0x0258
            r6 = r3
        L_0x0258:
            r4.url = r6
            int r6 = r5.c
            r4.width = r6
            int r6 = r5.d
            r4.height = r6
            java.lang.String r6 = r5.e
            if (r6 != 0) goto L_0x0267
            r6 = r3
        L_0x0267:
            r4.mp4Url = r6
            java.lang.String r6 = r5.f
            if (r6 != 0) goto L_0x026e
            r6 = r3
        L_0x026e:
            r4.firstUrl = r6
            java.util.List r6 = r5.g
            int r7 = r6.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.Object[] r6 = r6.toArray(r7)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r4.tags = r6
            java.lang.String r6 = r5.h
            if (r6 != 0) goto L_0x0285
            r6 = r3
        L_0x0285:
            r4.previewUrl = r6
            long r6 = r5.i
            r4.updateTime = r6
            int r6 = r5.j
            if (r6 == 0) goto L_0x02a2
            int r6 = hr1.t(r6)
            if (r6 == r0) goto L_0x029f
            if (r6 == r12) goto L_0x029d
            if (r6 == r10) goto L_0x029b
            r6 = r2
            goto L_0x02a0
        L_0x029b:
            r6 = r11
            goto L_0x02a0
        L_0x029d:
            r6 = r12
            goto L_0x02a0
        L_0x029f:
            r6 = r0
        L_0x02a0:
            r4.stickerType = r6
        L_0x02a2:
            long r6 = r5.k
            r4.setId = r6
            java.lang.String r6 = r5.l
            if (r6 != 0) goto L_0x02ab
            r6 = r3
        L_0x02ab:
            r4.lottieUrl = r6
            boolean r6 = r5.m
            r4.audio = r6
            int r6 = r5.n
            if (r6 == 0) goto L_0x02c4
            int r6 = hr1.t(r6)
            if (r6 == r0) goto L_0x02c1
            if (r6 == r12) goto L_0x02bf
            r6 = r2
            goto L_0x02c2
        L_0x02bf:
            r6 = r12
            goto L_0x02c2
        L_0x02c1:
            r6 = r0
        L_0x02c2:
            r4.authorType = r6
        L_0x02c4:
            java.lang.String r5 = r5.o
            if (r5 != 0) goto L_0x02c9
            r5 = r3
        L_0x02c9:
            r4.videoUrl = r5
            r1.sticker = r4
        L_0x02cd:
            boolean r4 = r15.g()
            if (r4 == 0) goto L_0x0314
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Share r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Share
            r4.<init>()
            f10 r5 = r15.g
            long r6 = r5.a
            r4.shareId = r6
            java.lang.String r6 = r5.b
            if (r6 != 0) goto L_0x02e3
            r6 = r3
        L_0x02e3:
            r4.url = r6
            java.lang.String r6 = r5.c
            if (r6 != 0) goto L_0x02ea
            r6 = r3
        L_0x02ea:
            r4.title = r6
            java.lang.String r6 = r5.d
            if (r6 != 0) goto L_0x02f1
            r6 = r3
        L_0x02f1:
            r4.description = r6
            java.lang.String r6 = r5.e
            if (r6 != 0) goto L_0x02f8
            r6 = r3
        L_0x02f8:
            r4.host = r6
            a10 r6 = r5.f
            if (r6 == 0) goto L_0x0304
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Photo r6 = n(r6)
            r4.image = r6
        L_0x0304:
            o10 r6 = r5.g
            if (r6 == 0) goto L_0x030e
            ru.ok.tamtam.nano.Protos$Attaches$Attach r6 = d(r6)
            r4.media = r6
        L_0x030e:
            boolean r5 = r5.h
            r4.deleted = r5
            r1.share = r4
        L_0x0314:
            j00 r4 = r15.h
            if (r4 == 0) goto L_0x0343
            ru.ok.tamtam.nano.Protos$Attaches$Attach$App r5 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$App
            r5.<init>()
            long r6 = r4.a
            r5.appId = r6
            java.lang.String r6 = r4.b
            if (r6 == 0) goto L_0x0327
            r5.name = r6
        L_0x0327:
            java.lang.String r6 = r4.c
            if (r6 == 0) goto L_0x032d
            r5.icon = r6
        L_0x032d:
            java.lang.String r6 = r4.d
            if (r6 == 0) goto L_0x0333
            r5.message = r6
        L_0x0333:
            int r6 = r4.e
            r5.state = r6
            long r6 = r4.f
            r5.timeout = r6
            java.lang.String r4 = r4.g
            if (r4 == 0) goto L_0x0341
            r5.appState = r4
        L_0x0341:
            r1.app = r5
        L_0x0343:
            o00 r4 = r15.i
            if (r4 == 0) goto L_0x039d
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Call r5 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Call
            r5.<init>()
            java.lang.String r6 = r4.a
            r5.conversationId = r6
            int r6 = r4.c
            if (r6 == 0) goto L_0x0365
            int r6 = hr1.t(r6)
            if (r6 == r0) goto L_0x0362
            if (r6 == r12) goto L_0x035f
            r5.callType = r2
            goto L_0x0367
        L_0x035f:
            r5.callType = r12
            goto L_0x0367
        L_0x0362:
            r5.callType = r0
            goto L_0x0367
        L_0x0365:
            r5.callType = r2
        L_0x0367:
            int r6 = r4.d
            if (r6 == 0) goto L_0x0386
            int r6 = hr1.t(r6)
            if (r6 == r0) goto L_0x0383
            if (r6 == r12) goto L_0x0380
            if (r6 == r10) goto L_0x037d
            if (r6 == r11) goto L_0x037a
            r5.hangupType = r2
            goto L_0x0388
        L_0x037a:
            r5.hangupType = r11
            goto L_0x0388
        L_0x037d:
            r5.hangupType = r10
            goto L_0x0388
        L_0x0380:
            r5.hangupType = r12
            goto L_0x0388
        L_0x0383:
            r5.hangupType = r0
            goto L_0x0388
        L_0x0386:
            r5.hangupType = r2
        L_0x0388:
            long r6 = r4.e
            r5.durationLong = r6
            java.util.List r6 = r4.f
            long[] r6 = defpackage.ek8.n(r6)
            r5.contactIds = r6
            java.lang.String r4 = r4.b
            if (r4 != 0) goto L_0x0399
            r4 = r3
        L_0x0399:
            r5.joinLink = r4
            r1.call = r5
        L_0x039d:
            boolean r4 = r15.c()
            if (r4 == 0) goto L_0x03cc
            ru.ok.tamtam.nano.Protos$Attaches$Attach$File r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$File
            r4.<init>()
            v00 r5 = r15.j
            long r6 = r5.a
            r4.fileId = r6
            long r6 = r5.b
            r4.size = r6
            java.lang.String r6 = r5.c
            if (r6 != 0) goto L_0x03b7
            r6 = r3
        L_0x03b7:
            r4.name = r6
            o10 r6 = r5.d
            if (r6 == 0) goto L_0x03c3
            ru.ok.tamtam.nano.Protos$Attaches$Attach r6 = d(r6)
            r4.preview = r6
        L_0x03c3:
            java.lang.String r5 = r5.e
            if (r5 != 0) goto L_0x03c8
            r5 = r3
        L_0x03c8:
            r4.token = r5
            r1.file = r4
        L_0x03cc:
            boolean r4 = r15.b()
            if (r4 == 0) goto L_0x0410
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Contact r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Contact
            r4.<init>()
            q00 r5 = r15.k
            java.lang.String r6 = r5.a
            if (r6 != 0) goto L_0x03de
            r6 = r3
        L_0x03de:
            r4.vcfBody = r6
            long r6 = r5.b
            r4.contactId = r6
            java.lang.String r6 = r5.c
            if (r6 != 0) goto L_0x03e9
            r6 = r3
        L_0x03e9:
            r4.name = r6
            java.lang.String r6 = r5.f
            if (r6 != 0) goto L_0x03f0
            r6 = r3
        L_0x03f0:
            r4.phone = r6
            java.lang.String r6 = r5.g
            if (r6 != 0) goto L_0x03f7
            r6 = r3
        L_0x03f7:
            r4.photoUrl = r6
            java.lang.String r6 = r5.h
            if (r6 != 0) goto L_0x03fe
            r6 = r3
        L_0x03fe:
            r4.localPhotoUrl = r6
            java.lang.String r6 = r5.d
            if (r6 != 0) goto L_0x0405
            r6 = r3
        L_0x0405:
            r4.firstName = r6
            java.lang.String r5 = r5.e
            if (r5 != 0) goto L_0x040c
            r5 = r3
        L_0x040c:
            r4.lastName = r5
            r1.contact = r4
        L_0x0410:
            b10 r4 = r15.l
            if (r4 == 0) goto L_0x044d
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Present r5 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Present
            r5.<init>()
            long r6 = r4.a
            r5.presentId = r6
            long r6 = r4.b
            r5.metadataId = r6
            long r6 = r4.c
            r5.senderId = r6
            long r6 = r4.d
            r5.receiverId = r6
            int r6 = r4.e
            int r6 = hr1.t(r6)
            if (r6 == r0) goto L_0x0441
            if (r6 == r12) goto L_0x043f
            if (r6 == r10) goto L_0x043d
            if (r6 == r11) goto L_0x0442
            if (r6 == r9) goto L_0x043b
            r9 = r2
            goto L_0x0442
        L_0x043b:
            r9 = r11
            goto L_0x0442
        L_0x043d:
            r9 = r10
            goto L_0x0442
        L_0x043f:
            r9 = r12
            goto L_0x0442
        L_0x0441:
            r9 = r0
        L_0x0442:
            r5.status = r9
            java.lang.String r4 = r4.f
            if (r4 != 0) goto L_0x0449
            r4 = r3
        L_0x0449:
            r5.presentJson = r4
            r1.present = r5
        L_0x044d:
            boolean r4 = r15.e()
            if (r4 == 0) goto L_0x04bd
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Location r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Location
            r4.<init>()
            x00 r5 = r15.m
            dm7 r6 = r5.a
            double r7 = r6.a
            r4.latitude = r7
            double r7 = r6.b
            r4.longitude = r7
            double r7 = r6.c
            r4.altitude = r7
            float r7 = r6.o
            r4.accuracy = r7
            float r7 = r6.X
            r4.bearing = r7
            float r6 = r6.Y
            r4.speed = r6
            long r6 = r5.b
            r4.livePeriod = r6
            long r6 = r5.c
            r4.startTime = r6
            long r6 = r5.d
            r4.endTime = r6
            java.util.List r6 = r5.e
            if (r6 == 0) goto L_0x04a1
            int r7 = r6.size()
            ru.ok.tamtam.nano.Protos$Attaches$LocationInfo[] r7 = new ru.ok.tamtam.nano.Protos.Attaches.LocationInfo[r7]
            r8 = r2
        L_0x048b:
            int r9 = r6.size()
            if (r8 >= r9) goto L_0x049f
            java.lang.Object r9 = r6.get(r8)
            y00 r9 = (defpackage.y00) r9
            ru.ok.tamtam.nano.Protos$Attaches$LocationInfo r9 = l(r9)
            r7[r8] = r9
            int r8 = r8 + r0
            goto L_0x048b
        L_0x049f:
            r4.track = r7
        L_0x04a1:
            java.lang.String r6 = r5.f
            if (r6 != 0) goto L_0x04a6
            goto L_0x04a7
        L_0x04a6:
            r3 = r6
        L_0x04a7:
            r4.deviceId = r3
            float r3 = r5.g
            r4.zoom = r3
            boolean r3 = r5.h
            r4.corrupted = r3
            y00 r3 = r5.i
            if (r3 == 0) goto L_0x04bb
            ru.ok.tamtam.nano.Protos$Attaches$LocationInfo r3 = l(r3)
            r4.lastLocation = r3
        L_0x04bb:
            r1.location = r4
        L_0x04bd:
            c10 r15 = r15.w
            int r15 = r15.ordinal()
            if (r15 == r0) goto L_0x04ca
            if (r15 == r12) goto L_0x04c9
            r0 = r2
            goto L_0x04ca
        L_0x04c9:
            r0 = r12
        L_0x04ca:
            r1.processingOnServerStatus = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.nano.b.d(o10):ru.ok.tamtam.nano.Protos$Attaches$Attach");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, p10] */
    public static jj7 e(Protos.Attaches attaches) {
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard;
        Protos.Attaches attaches2 = attaches;
        ? obj = new Object();
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard2 = attaches2.keyboard;
        if (inlineKeyboard2 != null) {
            obj.b = k(inlineKeyboard2);
        }
        Protos.Attaches.Attach.ReplyKeyboard replyKeyboard = attaches2.replyKeyboard;
        if (replyKeyboard != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                Protos.Attaches.Attach.ReplyButtons[] replyButtonsArr = replyKeyboard.buttons;
                if (i >= replyButtonsArr.length) {
                    break;
                }
                Protos.Attaches.Attach.ReplyButtons replyButtons = replyButtonsArr[i];
                if (replyButtons != null) {
                    arrayList.add(new u9c());
                    int i2 = 0;
                    while (true) {
                        Protos.Attaches.Attach.ReplyButton[] replyButtonArr = replyButtons.replyButton;
                        if (i2 >= replyButtonArr.length) {
                            break;
                        }
                        Protos.Attaches.Attach.ReplyButton replyButton = replyButtonArr[i2];
                        if (replyButton != null) {
                            u9c u9c = (u9c) arrayList.get(i);
                            int i3 = replyButton.type;
                            int i4 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? 5 : 4 : 3 : 2 : 1;
                            int i5 = replyButton.intent;
                            int i6 = i5 != 0 ? i5 != 1 ? i5 != 2 ? 4 : 3 : 2 : 1;
                            Protos.Attaches.Attach.Photo photo = replyButton.image;
                            u9c.add(new s9c(i4, i6, replyButton.text, photo != null ? m(photo) : null, replyButton.outgoingMessageId));
                        }
                        i2++;
                    }
                }
                i++;
            }
            obj.c = new v9c(arrayList, replyKeyboard.defaultInputDisabled);
        }
        for (Protos.Attaches.Attach attach : attaches2.attach) {
            if (obj.b != null || (inlineKeyboard = attach.inlineKeyboard) == null) {
                obj.a(c(attach));
            } else {
                obj.b = k(inlineKeyboard);
            }
        }
        return obj.c();
    }

    public static Protos.Attaches f(jj7 jj7) {
        String str;
        int i;
        jj7 jj72 = jj7;
        Protos.Attaches attaches = new Protos.Attaches();
        int size = ((List) jj72.a).size();
        Protos.Attaches.Attach[] attachArr = new Protos.Attaches.Attach[size];
        for (int i2 = 0; i2 < size; i2++) {
            attachArr[i2] = d(jj72.u(i2));
        }
        attaches.attach = attachArr;
        String str2 = "";
        vw6 vw6 = (vw6) jj72.b;
        if (vw6 != null) {
            Protos.Attaches.Attach.InlineKeyboard inlineKeyboard = new Protos.Attaches.Attach.InlineKeyboard();
            ArrayList arrayList = new ArrayList();
            for (List<yt0> it : vw6.a) {
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                for (yt0 yt0 : it) {
                    Protos.Attaches.Attach.Button button = new Protos.Attaches.Attach.Button();
                    int t = hr1.t(yt0.c);
                    button.intent = t != 0 ? t != 1 ? t != 2 ? 3 : 2 : 1 : 0;
                    switch (yt0.b.ordinal()) {
                        case 0:
                            i = 0;
                            break;
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            i = 7;
                            break;
                        case 6:
                            i = 6;
                            break;
                        default:
                            i = 4;
                            break;
                    }
                    button.type = i;
                    String str3 = yt0.a;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    button.title = str3;
                    String str4 = yt0.o;
                    if (str4 == null) {
                        str4 = str2;
                    }
                    button.url = str4;
                    String str5 = yt0.X;
                    if (str5 == null) {
                        str5 = str2;
                    }
                    button.payload = str5;
                    button.showLoading = yt0.w0;
                    button.quickLocation = yt0.Y;
                    button.contactId = yt0.Z;
                    arrayList2.add(button);
                    str2 = str2;
                }
            }
            str = str2;
            Protos.Attaches.Attach.Buttons[] buttonsArr = new Protos.Attaches.Attach.Buttons[arrayList.size()];
            Protos.Attaches.Attach.Button[] buttonArr = new Protos.Attaches.Attach.Button[0];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Protos.Attaches.Attach.Buttons buttons = new Protos.Attaches.Attach.Buttons();
                buttons.button = (Protos.Attaches.Attach.Button[]) ((List) arrayList.get(i3)).toArray(buttonArr);
                buttonsArr[i3] = buttons;
            }
            inlineKeyboard.buttons = buttonsArr;
            String str6 = vw6.b;
            if (str6 == null) {
                str6 = str;
            }
            inlineKeyboard.callbackId = str6;
            attaches.keyboard = inlineKeyboard;
        } else {
            str = str2;
        }
        v9c v9c = (v9c) jj72.c;
        if (v9c != null) {
            Protos.Attaches.Attach.ReplyKeyboard replyKeyboard = new Protos.Attaches.Attach.ReplyKeyboard();
            ArrayList arrayList3 = new ArrayList();
            for (List<s9c> it2 : v9c.a) {
                ArrayList arrayList4 = new ArrayList();
                arrayList3.add(arrayList4);
                for (s9c s9c : it2) {
                    Protos.Attaches.Attach.ReplyButton replyButton = new Protos.Attaches.Attach.ReplyButton();
                    int t2 = hr1.t(s9c.b);
                    replyButton.intent = t2 != 0 ? t2 != 1 ? t2 != 2 ? 3 : 2 : 1 : 0;
                    int t3 = hr1.t(s9c.a);
                    replyButton.type = t3 != 0 ? t3 != 1 ? t3 != 2 ? 3 : 2 : 1 : 0;
                    String str7 = s9c.c;
                    if (str7 == null) {
                        str7 = str;
                    }
                    replyButton.text = str7;
                    replyButton.outgoingMessageId = s9c.e;
                    a10 a10 = s9c.d;
                    if (a10 != null) {
                        replyButton.image = n(a10);
                    }
                    arrayList4.add(replyButton);
                }
            }
            Protos.Attaches.Attach.ReplyButtons[] replyButtonsArr = new Protos.Attaches.Attach.ReplyButtons[arrayList3.size()];
            Protos.Attaches.Attach.ReplyButton[] replyButtonArr = new Protos.Attaches.Attach.ReplyButton[0];
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                Protos.Attaches.Attach.ReplyButtons replyButtons = new Protos.Attaches.Attach.ReplyButtons();
                replyButtons.replyButton = (Protos.Attaches.Attach.ReplyButton[]) ((List) arrayList3.get(i4)).toArray(replyButtonArr);
                replyButtonsArr[i4] = replyButtons;
            }
            replyKeyboard.buttons = replyButtonsArr;
            replyKeyboard.defaultInputDisabled = v9c.b;
            attaches.replyKeyboard = replyKeyboard;
        }
        return attaches;
    }

    public static b62 g(Protos.Chat.ChatMedia chatMedia) {
        int i = chatMedia.totalCount;
        long j = chatMedia.firstMessageId;
        long j2 = chatMedia.lastMessageId;
        Protos.Chat.Chunk chunk = chatMedia.chunk;
        ArrayList arrayList = null;
        h62 i2 = chunk != null ? i(chunk) : null;
        Protos.Chat.Chunk[] chunkArr = chatMedia.chunks;
        if (chunkArr != null && chunkArr.length > 0) {
            for (Protos.Chat.Chunk i3 : chunkArr) {
                h62 i4 = i(i3);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(i4);
            }
        }
        return new b62(i2, i, j, j2, arrayList == null ? Collections.emptyList() : arrayList);
    }

    public static Protos.Chat.ChatMedia h(b62 b62) {
        Protos.Chat.ChatMedia chatMedia = new Protos.Chat.ChatMedia();
        chatMedia.firstMessageId = b62.c;
        chatMedia.lastMessageId = b62.d;
        chatMedia.totalCount = b62.b;
        h62 h62 = b62.a;
        if (h62 != null) {
            chatMedia.chunk = j(h62);
        }
        List list = b62.e;
        if (list.size() > 0) {
            chatMedia.chunks = new Protos.Chat.Chunk[list.size()];
            for (int i = 0; i < list.size(); i++) {
                chatMedia.chunks[i] = j((h62) list.get(i));
            }
        }
        return chatMedia;
    }

    public static h62 i(Protos.Chat.Chunk chunk) {
        long j = chunk.startTime;
        if (j == -1) {
            udd.S("Chunk.Builder", "", new IllegalStateException("start time is -1"));
        }
        long j2 = chunk.endTime;
        if (j2 == -1) {
            udd.S("Chunk.Builder", "", new IllegalStateException("end time is -1"));
        }
        return new h62(j, j2);
    }

    public static Protos.Chat.Chunk j(h62 h62) {
        Protos.Chat.Chunk chunk = new Protos.Chat.Chunk();
        chunk.startTime = h62.a;
        chunk.endTime = h62.b;
        return chunk;
    }

    public static vw6 k(Protos.Attaches.Attach.InlineKeyboard inlineKeyboard) {
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard2 = inlineKeyboard;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            Protos.Attaches.Attach.Buttons[] buttonsArr = inlineKeyboard2.buttons;
            if (i < buttonsArr.length) {
                Protos.Attaches.Attach.Buttons buttons = buttonsArr[i];
                arrayList.add(new ArrayList());
                int i2 = 0;
                while (true) {
                    Protos.Attaches.Attach.Button[] buttonArr = buttons.button;
                    if (i2 >= buttonArr.length) {
                        break;
                    }
                    Protos.Attaches.Attach.Button button = buttonArr[i2];
                    fu0 fu0 = (fu0) arrayList.get(i);
                    int i3 = button.type;
                    int i4 = 3;
                    hu0 hu0 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 5 ? i3 != 6 ? i3 != 7 ? hu0.UNKNOWN : hu0.OPEN_APP : hu0.MESSAGE : hu0.CHAT : hu0.REQUEST_GEO_LOCATION : hu0.REQUEST_CONTACT : hu0.LINK : hu0.CALLBACK;
                    int i5 = button.intent;
                    if (i5 == 0) {
                        i4 = 1;
                    } else if (i5 == 1) {
                        i4 = 2;
                    } else if (i5 != 2) {
                        i4 = 4;
                    }
                    String str = button.title;
                    String str2 = button.url;
                    String str3 = button.payload;
                    boolean z = button.quickLocation;
                    long j = button.contactId;
                    boolean z2 = button.showLoading;
                    vt0 vt0 = new vt0(str, hu0, i4);
                    vt0.d = str2;
                    vt0.e = str3;
                    vt0.h = j;
                    vt0.f = z;
                    vt0.g = z2;
                    fu0.add(new yt0(vt0));
                    i2++;
                    i = i;
                }
                i++;
            } else {
                int i6 = vw6.c;
                uw6 uw6 = new uw6();
                uw6.a = arrayList;
                uw6.b = inlineKeyboard2.callbackId;
                return new vw6(uw6);
            }
        }
    }

    public static Protos.Attaches.LocationInfo l(y00 y00) {
        Protos.Attaches.LocationInfo locationInfo = new Protos.Attaches.LocationInfo();
        dm7 dm7 = y00.a;
        locationInfo.latitude = dm7.a;
        locationInfo.longitude = dm7.b;
        locationInfo.altitude = dm7.c;
        locationInfo.accuracy = dm7.o;
        locationInfo.bearing = dm7.X;
        locationInfo.speed = dm7.Y;
        locationInfo.time = y00.b;
        return locationInfo;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, z00] */
    public static a10 m(Protos.Attaches.Attach.Photo photo) {
        a10 a10 = a10.A0;
        ? obj = new Object();
        obj.a = photo.baseUrl;
        obj.b = photo.photoUrl;
        obj.c = photo.width;
        obj.d = photo.height;
        obj.e = photo.gif;
        obj.f = photo.previewData;
        obj.g = photo.photoToken;
        obj.h = photo.photoId;
        obj.i = photo.mp4Url;
        obj.k = r1g.p(photo.previewUrl) ? null : photo.previewUrl;
        obj.j = photo.externalGifId;
        return obj.a();
    }

    public static Protos.Attaches.Attach.Photo n(a10 a10) {
        Protos.Attaches.Attach.Photo photo = new Protos.Attaches.Attach.Photo();
        String str = a10.a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        photo.baseUrl = str;
        String str3 = a10.b;
        if (str3 == null) {
            str3 = str2;
        }
        photo.photoUrl = str3;
        photo.width = a10.c;
        photo.height = a10.o;
        photo.gif = a10.X;
        byte[] bArr = a10.Y;
        if (bArr != null) {
            photo.previewData = bArr;
        }
        String str4 = a10.z0;
        if (str4 == null) {
            str4 = str2;
        }
        photo.previewUrl = str4;
        String str5 = a10.Z;
        if (str5 == null) {
            str5 = str2;
        }
        photo.photoToken = str5;
        photo.photoId = a10.w0;
        String str6 = a10.x0;
        if (str6 == null) {
            str6 = str2;
        }
        photo.mp4Url = str6;
        String str7 = a10.y0;
        if (str7 != null) {
            str2 = str7;
        }
        photo.externalGifId = str2;
        return photo;
    }

    public static int o(int i) {
        int t = hr1.t(i);
        int i2 = 1;
        if (t != 1) {
            i2 = 2;
            if (t != 2) {
                i2 = 3;
                if (t != 3) {
                    i2 = 4;
                    if (t != 4) {
                        i2 = 5;
                        if (t != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }
}
