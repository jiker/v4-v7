/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\workspace\\android_support_v4\\src\\android\\support\\v4\\media\\session\\IMediaControllerCallback.aidl
 */
package android.support.v4.media.session;
/**
 * Callback interface for a MediaSessionCompat to send updates to a
 * MediaControllerCompat. This is only used on pre-Lollipop systems.
 * @hide
 */
public interface IMediaControllerCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.support.v4.media.session.IMediaControllerCallback
{
private static final java.lang.String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.support.v4.media.session.IMediaControllerCallback interface,
 * generating a proxy if needed.
 */
public static android.support.v4.media.session.IMediaControllerCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.support.v4.media.session.IMediaControllerCallback))) {
return ((android.support.v4.media.session.IMediaControllerCallback)iin);
}
return new android.support.v4.media.session.IMediaControllerCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onEvent:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onEvent(_arg0, _arg1);
return true;
}
case TRANSACTION_onSessionDestroyed:
{
data.enforceInterface(DESCRIPTOR);
this.onSessionDestroyed();
return true;
}
case TRANSACTION_onPlaybackStateChanged:
{
data.enforceInterface(DESCRIPTOR);
android.support.v4.media.session.PlaybackStateCompat _arg0;
if ((0!=data.readInt())) {
_arg0 = android.support.v4.media.session.PlaybackStateCompat.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onPlaybackStateChanged(_arg0);
return true;
}
case TRANSACTION_onMetadataChanged:
{
data.enforceInterface(DESCRIPTOR);
android.support.v4.media.MediaMetadataCompat _arg0;
if ((0!=data.readInt())) {
_arg0 = android.support.v4.media.MediaMetadataCompat.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onMetadataChanged(_arg0);
return true;
}
case TRANSACTION_onQueueChanged:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> _arg0;
_arg0 = data.createTypedArrayList(android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR);
this.onQueueChanged(_arg0);
return true;
}
case TRANSACTION_onQueueTitleChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.CharSequence _arg0;
if ((0!=data.readInt())) {
_arg0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onQueueTitleChanged(_arg0);
return true;
}
case TRANSACTION_onExtrasChanged:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onExtrasChanged(_arg0);
return true;
}
case TRANSACTION_onVolumeInfoChanged:
{
data.enforceInterface(DESCRIPTOR);
android.support.v4.media.session.ParcelableVolumeInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.support.v4.media.session.ParcelableVolumeInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onVolumeInfoChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.support.v4.media.session.IMediaControllerCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void onEvent(java.lang.String event, android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(event);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSessionDestroyed() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onSessionDestroyed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// These callbacks are for the TransportController

@Override public void onPlaybackStateChanged(android.support.v4.media.session.PlaybackStateCompat state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((state!=null)) {
_data.writeInt(1);
state.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onPlaybackStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMetadataChanged(android.support.v4.media.MediaMetadataCompat metadata) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((metadata!=null)) {
_data.writeInt(1);
metadata.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onMetadataChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onQueueChanged(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> queue) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(queue);
mRemote.transact(Stub.TRANSACTION_onQueueChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onQueueTitleChanged(java.lang.CharSequence title) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((title!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(title, _data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onQueueTitleChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onExtrasChanged(android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onExtrasChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onVolumeInfoChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onSessionDestroyed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onPlaybackStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onMetadataChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onQueueChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onQueueTitleChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onExtrasChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onVolumeInfoChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public void onEvent(java.lang.String event, android.os.Bundle extras) throws android.os.RemoteException;
public void onSessionDestroyed() throws android.os.RemoteException;
// These callbacks are for the TransportController

public void onPlaybackStateChanged(android.support.v4.media.session.PlaybackStateCompat state) throws android.os.RemoteException;
public void onMetadataChanged(android.support.v4.media.MediaMetadataCompat metadata) throws android.os.RemoteException;
public void onQueueChanged(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> queue) throws android.os.RemoteException;
public void onQueueTitleChanged(java.lang.CharSequence title) throws android.os.RemoteException;
public void onExtrasChanged(android.os.Bundle extras) throws android.os.RemoteException;
public void onVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo info) throws android.os.RemoteException;
}
