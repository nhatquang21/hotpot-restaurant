package demo.springboot.hotpot.constants;

import java.util.LinkedHashMap;
import java.util.Map;

public class HttpErrorConstants {

  public static final Map<String, Map<String, String>> MESSAGES = prepareDefaultErrorMessages();

  public static Map<String, String> getMessage(String code) {
    Map<String, String> message = MESSAGES.get(code);
    return message != null ? message : MESSAGES.get(Code._500_INTERNAL);
  }

  private static Map<String, Map<String, String>> prepareDefaultErrorMessages() {
    Map<String, Map<String, String>> messageMappings = new LinkedHashMap<>();

    messageMappings.put(Code._500_INTERNAL,
      Map.of("en",
        "The system is being interrupted. Please try again",
        "vi",
        "Hệ thống bị gián đoạn. Vui lòng thử lại"));

    messageMappings.put(Code._422_INVALID_DATA,
      Map.of("en", "Your data is not valid", "vi", "Yêu cầu không hợp lệ. Vui lòng thử lại"));

    messageMappings.put(Code._401_INVALID_CAPTCHA_TOKEN,
      Map.of("en",
        "You have logged in incorrectly before. Please confirm the captcha to continue logging in",
        "vi",
        "Bạn đã đăng nhập sai trước đó. Vui lòng xác nhận captcha để tiếp tục đăng nhập"));

    messageMappings.put(Code._401_INCORRECT_USERNAME_PASSWORD,
      Map.of("en",
        "Username or password incorrect",
        "vi",
        "Thông tin đăng nhập không chính xác, vui lòng kiểm tra lại!"));

    messageMappings.put(Code._401_INVALID_USER,
      Map.of("en", "User is locked / pending!", "vi", "Tài khoản đã bị khóa / đang chờ duyệt, vui lòng thử lại sau!"));

    messageMappings.put(Code._404_NOT_FOUND_USER,
      Map.of("en", "User not found", "vi", "Tài khoản không tồn tại"));

    messageMappings.put(Code._401_UNAUTHORIZED,
      Map.of("en", "User is not logged in!", "vi", "Bạn chưa đăng nhập để thực hiện chức năng này!"));

    messageMappings.put(Code._403_DENIED_USER,
      Map.of("en",
        "User is denied to access to this website!",
        "vi",
        "Tài khoản không được phân quyền login trên website này. Vui lòng kiểm tra lại!"));

    messageMappings.put(Code._400_EXISTED_EMAIL,
      Map.of("en",
        "Create new user fail, Email existed!",
        "vi",
        "Thông tin đăng ký tài khoản đã tồn tại trên hệ thống. Vui lòng kiểm tra lại!"));

    messageMappings.put(Code._400_LOCKED_CUSTOMER,
      Map.of("en",
        "Account is locked. Please contact to 1800 5888 59",
        "vi",
        "Tài khoản hiện đang tạm khóa. Xin vui lòng liên hệ tổng đài 1800 5888 59"));

    messageMappings.put(Code._400_INCORRECT_OLD_PASSWORD,
      Map.of("en",
        "Old password is incorrect. Please check again!",
        "vi",
        "Mật khẩu cũ không đúng. Vui lòng kiểm tra lại!"));
    messageMappings.put(Code._400_DUPLICATED_MASTER_MERCHANT_NAME,
      Map.of("en",
        "Duplicated master merchant name!",
        "vi",
        "Thông tin NCC tổng đã tồn tại: Tên NCC tổng đã tồn tại!"));
    messageMappings.put(Code._400_DUPLICATED_MASTER_MERCHANT_TAX_NUMBER,
      Map.of("en",
        "Duplicated master merchant tax number",
        "vi",
        "Thông tin NCC tổng đã tồn tại: Mã số thuế NCC tổng đã tồn tại!"));

    messageMappings.put(Code._401_INVALID_TOKEN,
      Map.of("en", "Token is invalid!", "vi", "Token không hợp lệ. Vui lòng kiểm tra lại!"));

    messageMappings.put(Code._401_LOCK_USER,
      Map.of("en", "User is locked!", "vi", "Tài khoản đã bị khoá/ đang chờ duyệt, vui lòng thử lại sau!"));

    messageMappings.put(Code._401_LOCK_ROLE,
      Map.of("en", "Role is locked!", "vi", "Phân quyền của bạn đã bị khoá. Vui lòng thử lại sau!"));

    messageMappings.put(Code._401_INVALID_MERCHANT,
      Map.of("en", "Merchant is locked!", "vi", "Nhà cung cấp không còn hoạt đông. Vui lòng kiểm tra lại!"));

    messageMappings.put(Code._403_ACCESS_DENIED,
      Map.of("en", "User is denied to access", "vi", "Người dùng không được phép truy cập, vui lòng kiểm tra lại!"));

    messageMappings.put(Code._400_CANNOT_CREATE_MERCHANT,
      Map.of("en", "Failed to create merchant!", "vi", "Thêm mới nhà cung cấp không thành công!"));

    messageMappings.put(Code._400_CANNOT_UPDATE_MERCHANT,
      Map.of("en", "Failed to update merchant!", "vi", "Cập nhật nhà cung cấp không thành công!"));

    messageMappings.put(Code._400_CANNOT_LOCK_MERCHANT,
      Map.of("en", "Failed to lock merchant!", "vi", "Khoá nhà cung cấp không thành công!"));

    messageMappings.put(Code._400_CANNOT_UNLOCK_MERCHANT,
      Map.of("en", "Failed to unlock merchant!", "vi", "Mở khoá nhà cung cấp không thành công!"));

    messageMappings.put(Code._400_CANNOT_UPLOAD_ATTACHMENT,
      Map.of("en", "Failed to upload attachment", "vi", "Tải lên tập tin không thành công"));

    messageMappings.put(Code._500_CHANGE_PASSWORD_FAIL,
      Map.of("en", "Change pasword fail", "vi", "Đổi mật khẩu không thành công."));

    messageMappings.put(Code._400_CANNOT_VOID_BRAND,
      Map.of("en", "Failed to make brand void!", "vi", "Vô hiệu thương hiệu không thành công!"));

    messageMappings.put(Code._400_CANNOT_VOID_BRAND_DUE_TO_ACTIVE_PRODUCT,
      Map.of("en",
        "There is at least one active product.",
        "vi",
        "Thương hiệu đang tồn tại sản phẩm đang hoạt động, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_EXISTED_BRAND,
      Map.of("en", "Brand has already existed.", "vi", "Thương hiệu đã tồn tại, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_CANNOT_CREATE_BRAND,
      Map.of("en", "Failed to create brand!", "vi", "Thêm mới thương hiệu không thành công!"));

    messageMappings.put(Code._400_CANNOT_UPDATE_BRAND,
      Map.of("en", "Failed to update brand!", "vi", "Cập nhật thương hiệu không thành công!"));

    messageMappings.put(Code._400_EXISTED_CHANNEL,
      Map.of("en", "Channel has already existed.", "vi", "Nhóm điểm bán đã tồn tại, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_CANNOT_CREATE_CHANNEL,
      Map.of("en", "Failed to create channel!", "vi", "Thêm mới nhóm điểm bán không thành công!"));

    messageMappings.put(Code._404_NOT_FOUND_CHANNEL,
      Map.of("en", "Channel is not found.", "vi", "Nhóm điểm bán không tồn tại."));

    messageMappings.put(Code._400_CONTAINS_ACTIVE_SUBCHANNEL,
      Map.of("en",
        "Channel has at least one active sub channel.",
        "vi",
        "Nhóm điểm bán đang tồn tại điểm bán trực thuộc hoạt động, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_CONTAINS_ACTIVE_PRODUCT,
      Map.of("en",
        "Channel has at least one active product.",
        "vi",
        "Nhóm điểm bán đang tồn tại sản phẩm đang hoạt động, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_EXISTED_SUBCHANNEL_NAME,
      Map.of("en", "Sub channel's name has already existed.", "vi", "Tên điểm bán đã tồn tại, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_EXISTED_SUBCHANNEL_CODE,
      Map.of("en", "Sub channel's code has already existed.", "vi", "Mã điểm bán đã tồn tại, vui lòng kiểm tra lại."));

    messageMappings.put(Code._404_NOT_FOUND_SUBCHANNEL,
      Map.of("en", "Sub channel is not found.", "vi", "Điểm bán không tồn tại."));

    messageMappings.put(Code._400_CANNOT_VOID_PRODUCT_ATTRIBUTE,
      Map.of("en", "Failed to make attribute void!", "vi", "Vô hiệu thuộc tính không thành công!"));

    messageMappings.put(Code._400_CANNOT_VOID_PRODUCT_ATTRIBUTE_DUE_TO_ACTIVE_PRODUCT,
      Map.of("en",
        "There is at least one active product.",
        "vi",
        "Thuộc tính đang tồn tại sản phẩm đang hoạt động, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_EXISTED_PRODUCT_ATTRIBUTE,
      Map.of("en", "Attribute has already existed.", "vi", "Thuộc tính đã tồn tại, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_CANNOT_CREATE_PRODUCT_ATTRIBUTE,
      Map.of("en", "Failed to create attribute!", "vi", "Thêm mới thuộc tính không thành công!"));

    messageMappings.put(Code._400_CANNOT_UPDATE_PRODUCT_ATTRIBUTE,
      Map.of("en", "Failed to update attribute!", "vi", "Cập nhật thuộc tính không thành công!"));

    messageMappings.put(Code._400_THE_SAME_PASSWORD_BEFORE,
      Map.of("en", "The new password equal current password!", "vi", "Mật khẩu mới không được trùng với mật khẩu cũ!"));

    messageMappings.put(Code._400_CANNOT_VOID_ATTRIBUTE_GROUP,
      Map.of("en", "Failed to make attribute group void!", "vi", "Vô hiệu bộ thuộc tính không thành công!"));

    messageMappings.put(Code._400_CANNOT_VOID_ATTRIBUTE_GROUP_DUE_TO_ACTIVE_CATEGORY,
      Map.of("en",
        "There is at least one active category.",
        "vi",
        "Bộ thuộc tính đang tồn tại danh mục ngành hàng đang hoạt động, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_EXISTED_ATTRIBUTE_GROUP,
      Map.of("en", "Attribute group has already existed.", "vi", "Bộ thuộc tính đã tồn tại, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_CANNOT_CREATE_ATTRIBUTE_GROUP,
      Map.of("en", "Failed to create attribute group!", "vi", "Thêm mới bộ thuộc tính không thành công!"));
    messageMappings.put(Code._400_EXISTED_PRODUCT,
      Map.of("en", "Product exist. Please check again.", "vi", "Sản phẩm đã tồn tại, vui lòng kiểm tra lại."));
    messageMappings.put(Code._400_CANNOT_UPDATE_ATTRIBUTE_GROUP,
      Map.of("en", "Failed to update attribute group!", "vi", "Cập nhật bộ thuộc tính không thành công!"));
    messageMappings.put(Code._400_INVALID_BRAND,
      Map.of("en", "Brand is invalid!", "vi", "Thương hiệu không hiệu lực, Vui lòng kiểm tra lại!"));
    messageMappings.put(Code._400_CAN_NOT_ACTIVE_MISSING_ASSET,
      Map.of("en", "Can not active. Missing images", "vi", "Sản phẩm không thể hiệu lực, vui lòng cung cấp ảnh"));
    messageMappings.put(Code._400_CAN_NOT_ACTIVE_MISSING_PRICE,
      Map.of("en", "Can not active. Missing prices", "vi", "Sản phẩm không thể hiệu lực, vui lòng cung cấp giá"));
    messageMappings.put(Code._400_CAN_NOT_ACTIVE_MISSING_DESCRIPTION,
      Map.of("en",
        "Can not active. Missing description",
        "vi",
        "Sản phẩm không thể hiệu lực, vui lòng cung cấp mô tả"));
    messageMappings.put(Code._400_INVALID_PRODUCT_CATEGORY,
      Map.of("en", "Product category is invalid!", "vi", "Ngành hàng không hiệu lực, Vui lòng kiểm tra lại!"));
    messageMappings.put(Code._400_INVALID_PRODUCT_ATTRIBUTE_GROUP,
      Map.of("en", "Product category group is invalid!", "vi", "Bộ thuộc tính không hiệu lực, Vui lòng kiểm tra lại!"));
    messageMappings.put(Code._400_INVALID_OPERATOR,
      Map.of("en", "Operator category invalid!", "vi", "Nhà vận hành không hiệu lực, Vui lòng kiểm tra lại!"));
    messageMappings.put(Code._400_REQUEST_INVALID_PRODUCT,
      Map.of("en",
        "Send request of product fail. Product is not draft",
        "vi",
        "Trạng thái sản phẩm khác đang nhập liệu. Vui lòng kiểm tra lại"));
    messageMappings.put(Code._400_MAKE_VOID_INVALID_PRODUCT,
      Map.of("en",
        "Make void product fail. Product is not active!",
        "vi",
        "Vô hiệu sản phẩm không thành công. Sản phẩm không ở trạng thái hiệu lực!"));
    messageMappings.put(Code._400_MARK_ACTIVE_INVALID_PRODUCT,
      Map.of("en",
        "Mark active product fail. Product is not void!",
        "vi",
        "Kích hoạt sản phẩm không thành công. Sản phẩm không ở trạng thái vô hiệu!"));
    messageMappings.put(Code._400_CANNOT_VOID_PRODUCT_CATEGORY,
      Map.of("en", "Failed to make category void!", "vi", "Vô hiệu danh mục ngành hàng không thành công!"));

    messageMappings.put(Code._400_CANNOT_VOID_PRODUCT_CATEGORY_DUE_TO_ACTIVE_PRODUCT,
      Map.of("en",
        "There is at least one active product.",
        "vi",
        "Ngành hàng đang tồn tại sản phẩm đang hoạt động, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_EXISTED_PRODUCT_CATEGORY,
      Map.of("en", "Category has already existed.", "vi", "Danh mục ngành hàng đã tồn tại, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_CANNOT_CREATE_PRODUCT_CATEGORY,
      Map.of("en", "Failed to create category!", "vi", "Thêm mới danh mục ngành hàng không thành công!"));

    messageMappings.put(Code._400_CANNOT_UPDATE_PRODUCT_CATEGORY,
      Map.of("en", "Failed to update category!", "vi", "Cập nhật danh mục ngành hàng không thành công!"));

    messageMappings.put(Code._400_EXISTED_PENDING_TASK,
      Map.of("en",
        "Create new task fail. The pending exists current task!",
        "vi",
        "Tạo tác vụ lỗi. Đang tồn tại tác vụ chưa được xủ lý!"));
    messageMappings.put(Code._400_RUN_TASK_BEFORE,
      Map.of("en",
        "Can not run this task. Task run before!",
        "vi",
        "Tác vụ đã thực hiện trước đó. Vui lòng kiểm tra lại!"));
    messageMappings.put(Code._400_CAN_NOT_ADD_VARIANT_WITH_SINGLE_PRODUCT,
      Map.of("en", "Add new variant fail with single product!", "vi", "Không thể  thêm biến thể với sản phẩm đơn!"));
    messageMappings.put(Code._400_CAN_NOT_UPDATE_PRICE_WITH_ACTIVE_PRODUCT,
      Map.of("en",
        "Update price fail with active product!",
        "vi",
        "Không thể  cập nhật giá với sản phẩm đang hiệu lực!"));
    messageMappings.put(Code._400_CAN_NOT_DELETE_PRICE_WITH_ACTIVE_PRODUCT,
      Map.of("en",
        "Delete price fail with active or void product!",
        "vi",
        "Không thể  xóa giá với sản phẩm đang hiệu lực hoặc vô hiệu!"));
    messageMappings.put(Code._400_CAN_NOT_UPDATE_PRICE_WITH_ACTIVE_VARIANT,
      Map.of("en",
        "Update price fail with active or void variant!",
        "vi",
        "Không thể  cập nhật giá với biến thể đang hiệu lực hoặc vô hiệu!"));
    messageMappings.put(Code._400_CAN_NOT_DELETE_PRICE_WITH_ACTIVE_VARIANT,
      Map.of("en",
        "Delete price fail with active or void variant!",
        "vi",
        "Không thể  xóa giá với biến thể đang hiệu lực hoặc vô hiệu!"));
    messageMappings.put(Code._400_CAN_NOT_UPDATE_INFO_WITH_PENDING_PRODUCT,
      Map.of("en",
        "Update info with pending product fail!",
        "vi",
        "Không thể cập nhật thông tin sản phẩm đang chờ duyệt!"));
    messageMappings.put(Code._400_CAN_NOT_UPDATE_INFO_WITH_PENDING_VARIANT,
      Map.of("en",
        "Update info with pending product variant fail!",
        "vi",
        "Không thể cập nhật thông tin biến thể đang chờ duyệt!"));
    messageMappings.put(Code._400_STATUS_THE_SAME_BEFORE_STATUS,
      Map.of("en",
        "Update product status fail. New status must be difference before status!",
        "vi",
        "Cập nhật trạng thái không thành công. Trạng thái mới phải khác trạng thái cũ!"));
    messageMappings.put(Code._404_NOT_FOUND_PRODUCT,
      Map.of("en", "Product not found!", "vi", "Sản phẩm không tồn tại!"));
    messageMappings.put(Code._400_CAN_NOT_CREATE_PARENT_PRODUCT_WITH_EMPTY_VARIANTS,
      Map.of("en",
        "Create fail, parent product has not variants",
        "vi",
        "Không thể tạo sản phẩm cha với không giá trị biến thể"));
    messageMappings.put(Code._400_INVALID_MERCHANT,
      Map.of("en", "Merchant is not active", "vi", "Nhà cung cấp có trạng thái khác hiệu lực."));
    messageMappings.put(Code._400_INVALID_ATTRIBUTE_GROUP,
      Map.of("en",
        "Attribute group is not found or not active",
        "vi",
        "Bộ thuộc tính không tồn tại hoặc không còn hoạt động."));
    messageMappings.put(Code._400_INVALID_CHANNEL,
      Map.of("en",
        "Channel is not found or not active",
        "vi",
        "Nhóm điểm bán không tồn tại hoặc không còn hoạt động."));
    messageMappings.put(Code._400_CANNOT_VOID_SUBCHANNEL,
      Map.of("en", "Failed to make subchannel void!", "vi", "Vô hiệu điểm bán không thành công!"));
    messageMappings.put(Code._400_CANNOT_UPDATE_SUBCHANNEL,
      Map.of("en", "Failed to update subchannel!", "vi", "Cập nhật điểm bán không thành công!"));
    messageMappings.put(Code._400_CAN_NOT_DELETE_NOT_DRAFT_VARIANT,
      Map.of("en",
        "Can not delete varaint with not be draft",
        "vi",
        "Không thể xóa giá trị biến thể này tại toàn bộ biến thể trong danh sách"));

    messageMappings.put(Code._400_CAN_NOT_CANCEL_PRICE_WITH_STATUS_NOT_COMING,
      Map.of("en",
        "Can not cancel price which is not coming!",
        "vi",
        "Không thể hủy giá với trạng thái khác sắp hiệu lực!"));
    messageMappings.put(Code._400_SALE_PRICE_BE_GREATER_THAN_LIST_PRICE,
      Map.of("en",
        "Create fail. Sale price must be less than current active list price",
        "vi",
        "Giá bán phải nhỏ hơn hoặc bằng Giá niêm yết, vui lòng kiểm tra lại."));
    messageMappings.put(Code._400_LIST_PRICE_BE_LESS_THAN_SALE_PRICE,
      Map.of("en",
        "Create fail. List price must be greater than current active sale price",
        "vi",
        "Giá niêm yết phải lớn hơn hoặc bằng Giá bán, vui lòng kiểm tra lại."));
    messageMappings.put(Code._400_START_DATE_AFTER_END_DATE,
      Map.of("en",
        "Create fail. Start date must be less than or equal end date",
        "vi",
        "Ngày kết thúc phải lớn hơn ngày bắt đầu"));

    messageMappings.put(Code._400_INVALID_STATUS_SKU,
      Map.of("en", "Invalide Status sku for create price", "vi", "Trạng thái SKU không hợp lệ cho tạo giá"));

    messageMappings.put(Code._400_EXISTS_SKU_NOT_ASSIGN,
      Map.of("en", "Exsist sku not assign", "vi", "Tồn tại sản phẩm và số lượng chưa được ghi nhận quy đổi giá trị"));

    messageMappings.put(Code._400_EXISTS_REQUEST_REFUND_SHIPPING_FEE,
      Map.of("en",
        "Exsist request has refund shipping fee",
        "vi",
        "Đơn hàng đã tồn tại yêu cầu trả hàng có hoàn ship khác"));

    messageMappings.put(Code._400_CAN_NOT_MAKE_ORDER_WITH_INVALID_VOUCHER,
      Map.of("en",
        "Can not make order with invalid voucher",
        "vi",
        "Không thể tạo đơn hàng với thông tin khuyến mãi không hợp lệ"));

    messageMappings.put(Code._400_CAN_NOT_CREATE_SALE_PRICE_FOR_GIFT,
      Map.of("en",
        "Can not create sale price for gift with amount greater than zero",
        "vi",
        "Không thể tạo giá bán cho hàng tặng với giá trị lớn hơn 0"));

    messageMappings.put(Code._400_CANNOT_SYNC_PRODUCT,
      Map.of("en",
        "This product cannot be synchronized to Eton",
        "vi",
        "Sản phẩm này không thể được đồng bộ sang Eton"));

    messageMappings.put(Code._400_CAN_NOT_CREATE_PRICE_FROM_NO_EXISTS_FILE,
      Map.of("en", "Can not create price from no exists file", "vi", "Không thể tạo giá từ file không tồn tại"));

    messageMappings.put(Code._400_CAN_NOT_CREATE_PRODUCT_FROM_NO_EXISTS_FILE,
      Map.of("en", "Can not create product from no exists file", "vi", "Không thể tạo sản phẩm từ file không tồn tại"));

    messageMappings.put(Code._400_CAN_NOT_PROCESS_NOT_PENDING_FILE,
      Map.of("en",
        "Can run task for not pending file",
        "vi",
        "Không thể thực hiện tác vụ với file có trạng thái không phải chờ duyệt"));

    messageMappings.put(Code._400_INVALID_HEADER_SIZE_UPDATE_PRODUCT_ATTRIBUTE_TEMPLATE,
      Map.of("en",
        "The number of product attribute columns are invalid",
        "vi",
        "Số lượng cột trong file không hợp lệ"));

    messageMappings.put(Code._400_INVALID_HEADER_VALUE_UPDATE_PRODUCT_ATTRIBUTE_TEMPLATE,
      Map.of("en", "There is at least one invalid product attribute column", "vi", "Tên cột trong file không hợp lệ"));

    messageMappings.put(Code._404_ATTRIBUTE_GROUP_NOT_FOUND,
      Map.of("en", "Attribute group does not exist", "vi", "Bộ thuộc tính không tồn tại"));

    messageMappings.put(Code._404_CATEGORY_NOT_FOUND,
      Map.of("en", "Category does not exist", "vi", "Danh mục ngành hàng không tồn tại"));

    messageMappings.put(Code._400_PARENT_CATEGORY_IS_NOT_SYNCED_YET,
      Map.of("en", "Parent category is not synchronized yet", "vi", "Danh mục cha chưa đồng bộ, vui lòng thử lại"));

    messageMappings.put(Code._400_CATEGORY_IS_NOT_SYNCED_YET_FOR_SYNC_PRODUCT,
      Map.of("en", "Category is not synchronized yet", "vi", "Danh mục ngành hàng chưa đồng bộ, vui lòng thử lại"));

    messageMappings.put(Code._400_CANNOT_UPDATE_CATEGORY_DUE_TO_PENDING_PRODUCT,
      Map.of("en",
        "There is at least one product in pending status which belongs to this category.",
        "vi",
        "Danh mục ngành hàng đang gán với sản phẩm Chờ duyệt, vui lòng kiểm tra lại."));

    messageMappings.put(Code._404_MERCHANT_NOT_FOUND,
      Map.of("en", "Merchant does not exist.", "vi", "Nhà cung cấp không tồn tại."));

    messageMappings.put(Code._404_WAREHOUSE_NOT_FOUND,
      Map.of("en", "Warehouse does not exist.", "vi", "Kho không tồn tại."));

    messageMappings.put(Code._404_PROVIDER_NOT_FOUND,
      Map.of("en", "Provider does not exist.", "vi", "NCC không tồn tại."));

    messageMappings.put(Code._400_WAREHOUSE_IS_NOT_ACTIVE,
      Map.of("en", "Warehouse is not active.", "vi", "Kho có trạng thái khác hiệu lực."));

    messageMappings.put(Code._400_INVALID_WAREHOUSE,
      Map.of("en", "Warehouse is not valid.", "vi", "Kho không hợp lệ."));

    messageMappings.put(Code._404_RECORD_NOT_FOUND,
      Map.of("en", "Record does not exist.", "vi", "Bản ghi không tồn tại."));

    messageMappings.put(Code._400_INVALID_SKU_TO_CREATE_OR_UPDATE_PRODUCT_SUPPLIER_INFO,
      Map.of("en", "SKU is not valid.", "vi", "Trạng thái SKU trông hợp lệ."));

    messageMappings.put(Code._400_INVALID_PURCHASE_ORDER_VNIS_LINE_SKU,
      Map.of("en", "SKU is not valid.", "vi", "SKU không hợp lệ."));

    messageMappings.put(Code._404_NOT_FOUND_ACTIVE_SUPPLIER_PRICE_SKU,
      Map.of("en", "SKU is not declared supplier price", "vi", "SKU chưa khai báo giá nhà cung cấp"));

    messageMappings.put(Code._404_NOT_FOUND_PURCHASE_ORDER,
      Map.of("en", "Purchase order is not found", "vi", "Đơn đặt nhà cung cấp không tồn tại"));

    messageMappings.put(Code._400_CANNOT_ADD_OR_DELETE_SKU_WITH_COMPLETED,
      Map.of("en",
        "Can not add or delete sku with status full or a part",
        "vi",
        "Không thể thêm hoặc xóa SKU với trạng thái hoàn tất hoặc đã nhập 1 phần"));

    messageMappings.put(Code._400_CANNOT_CHANGE_TAX_OR_PRICE_SKU_WITH_UNCOMPLETED,
      Map.of("en",
        "Can not change tax or price with new",
        "vi",
        "Không thể thay đổi thuế hoặc giá với trạng thái thêm mới"));

    messageMappings.put(Code._400_CAN_NOT_UPDATE_INFO_WITH_PENDING_OR_WAITING_PURCHASE_ORDER,
      Map.of("en",
        "Update info with pending or waiting purchase order fail!",
        "vi",
        "Không thể cập nhật thông tin đơn đặt hàng nhà cung cấp đang chờ duyệt hoặc chờ nhập hàng!"));

    messageMappings.put(Code._400_SKU_HAS_STOCK_IN_SAME_VIRTUAL_WAREHOUSE_PARTNER,
      Map.of("en",
        "SKU already has real stock > 0 in same supplier's virtual warehouse",
        "vi",
        "SKU đã có tồn thực tế > 0 ở kho ảo NCC"));
    messageMappings.put(Code._400_DECREASE_QUANTITY_EXCEED_INVENTORY_QUANTITY,
      Map.of("en",
        "Decrease quantity exceed inventory quantity",
        "vi",
        "Số lượng giảm tồn phải nhỏ hơn hoặc bằng số lượng tồn khả dụng!"));
    messageMappings.put(Code._400_NOT_SUPPORT_DELIVERY_PROVIDER,
      Map.of("en", "Delivery provider is not supported", "vi", "Nhà vận chuyển không được hổ trợ"));

    messageMappings.put(Code._400_VNIS_NOT_SUPPORT_DELIVERY_PROVIDER,
      Map.of("en",
        "Vnis is not supported this delivery provider",
        "vi",
        "VNIS không hổ trợ vận chuyển bởi nhà cung cấp vận chuyển này"));

    messageMappings.put(Code._400_WARD_DISTRICT_PROVINCE_DUPLICATE,
      Map.of("en",
        "Current active record has ward, district, province",
        "vi",
        "Đã tồn tại bản ghi Tỉnh - Quận - Huyện với trạng thái Hiệu lực"));

    messageMappings.put(Code._400_WAREHOUSE_DUPLICATE,
      Map.of("en",
        "Current active record has warehouse",
        "vi",
        "Đã tồn tại bản ghi gán vận chuyển tự động Hiệu lực với Kho hiện tại"));

    messageMappings.put(Code._400_INVALID_FILE_IMPORT_TYPE,
      Map.of("en", "File import type is not valid", "vi", "Loại file import không hợp lệ"));

    messageMappings.put(Code._404_CUSTOMER_NOT_FOUND,
      Map.of("en", "Can not find customer", "vi", "Không tìm thầy khách hàng"));

    messageMappings.put(Code._404_CART_NOT_FOUND, Map.of("en", "Can not find cart", "vi", "Không tìm thầy giỏ hàng"));

    // TODO: update messages
    messageMappings.put(Code._400_INVALID_PURCHASE_ORDER_TO_RETURN,
      Map.of("en", "Invalid purchase order", "vi", "PO không hợp lệ"));
    messageMappings.put(Code._400_INVALID_PURCHASE_ORDER_RETURN_TO_EXPORT_INVOICE,
      Map.of("en", "Invalid purchase order return", "vi", "POR không hợp lệ"));

    messageMappings.put(Code._400_INVALID_PURCHASE_ORDER_LINE_TO_RETURN,
      Map.of("en", "SKU is not valid to return.", "vi", "SKU không hợp lệ để trả hàng."));

    messageMappings.put(Code._400_QTY_TO_RETURN_GREATER_THAN_AVAILABLE_QTY,
      Map.of("en",
        "The available quantity has not enough to return",
        "vi",
        "Số lượng trả vượt quá số lượng tồn kho khả dụng."));

    messageMappings.put(Code._400_VIRTUAL_WAREHOUSE_NOT_BELONG_TO_MERCHANT,
      Map.of("en", "The virtual warehouse is not belong to supplier", "vi", "Kho ảo không thuộc về nhà cung cấp"));

    messageMappings.put(Code._400_ONLY_ACCEPT_PHYSICAL_WAREHOUSE,
      Map.of("en", "Only accept physical warehouse", "vi", "Chỉ được phép chọn kho vật lý"));

    messageMappings.put(Code._400_GIFT_PRODUCT_IS_NOT_ALLOWED_TO_RETURN,
      Map.of("en", "SKU is gift or does not exist in this PO.", "vi", "SKU là hàng tặng hoặc không tồn tại trong PO."));

    messageMappings.put(Code._400_FAILED_TO_CREATE_ETON_POR,
      Map.of("en", "Failed to create sales order in ETON", "vi", "Đồng bộ thất bại sang hệ thống đối tác"));

    messageMappings.put(Code._404_SKU_NOT_EXISTS_PURCHASE_ORDER,
      Map.of("en", "Sku does not exists in purchase order", "vi", "SKU không tồn tại trên đơn đặt hàng NCC"));

    messageMappings.put(Code._400_SKU_HAS_IN_STOCK_IN_ANOTHER_VIRTUAL_WAREHOUSE,
      Map.of("en",
        "SKU [%s - %s] has in stock in the warehouse [%s] of provider [%s]!",
        "vi",
        "SKU [%s - %s] đang có tồn thực tế ở kho ảo [%s] của NCC [%s], vui lòng kiểm tra lại!"));

    // messageMappings.put(
    // Code._400_SKU_HAS_STOCK_IN_OTHER_VIRTUAL_WAREHOUSE_PARTNER,
    // Map.of(
    // "en", "SKU already has real stock > 0 in another supplier's virtual warehouse",
    // "vi", "SKU đã có tồn thực tế > 0 ở kho ảo NCC khác trên hệ thống"
    // )
    // );

    messageMappings.put(Code._400_CAN_NOT_INCOMING_PRODUCT_WITH_FULL_PURCHASE_ORDER,
      Map.of("en",
        "Can not incoming product with full purchase order",
        "vi",
        "Không thể nhập thêm hàng với đơn hàng hoàn tất"));

    messageMappings.put(Code._400_CAN_NOT_FINISHED_PO_WITH_INVALID_STATUS,
      Map.of("en",
        "Can not finish purchase order with status is not waiting",
        "vi",
        "Không thể kết thúc đơn nhập hàng với trạng thái khác chờ nhận hàng"));

    messageMappings.put(Code._400_CAN_NOT_INCOMING_WITH_FULL_PRODUCT,
      Map.of("en", "Can not incoming with full product", "vi", "Không thể nhập, Sản phẩm đã nhập hoàn tất"));

    messageMappings.put(Code._400_ACTUAL_QUANTITY_EXCEED_EXPECTED_QUANTITY,
      Map.of("en", "Actual quantity exceed expected quantity", "vi", "Số lượng nhập vướt quá số lượng mong đợi"));

    messageMappings.put(Code._400_QUANTITY_EXCEED_AVAILABLE_QUANTITY,
      Map.of("en", "Quantity exceed available quantity", "vi", "Tồn kho khả dụng không hợp lệ. Vui lòng kiểm tra lại"));

    messageMappings.put(Code._400_INVALID_STOCK_QUANTITY,
      Map.of("en", "Stock Quantity is invalid", "vi", "Không đủ tồn khả dụng trong kho"));

    messageMappings.put(Code._400_INVALID_ETON_SIGNATURE,
      Map.of("en", "Eton signature is invalid", "vi", "Chữ ký không hợp lệ"));

    messageMappings.put(Code._404_NOT_FOUND_ETON_SIGNATURE,
      Map.of("en", "Eton signature not found", "vi", "Chữ ký không được cung cấp"));

    messageMappings.put(Code._400_DUPLICATE_SKU,
      Map.of("en", "Duplicate the same type SKU", "vi", "Tồn tại nhiều hơn 1 SKU cùng loại"));
    messageMappings.put(Code._400_INVALID_STATUS_FOR_APPROVE,
      Map.of("en", "Invalid status for approve", "vi", "Trạng thái khồng hợp lệ cho duyệt"));
    messageMappings.put(Code._400_INVALID_STATUS_FOR_CANCEL,
      Map.of("en", "Invalid status for cancle", "vi", "Trạng thái khồng hợp lệ để hủy"));

    messageMappings.put(Code._400_PURCHASE_ORDER_LINE_TO_RETURN_DOES_NOT_EXIST,
      Map.of("en",
        "SKU does not exist in the purchase order which you want to return",
        "vi",
        "không tìm thấy sku cần trả trong đơn đặt hàng NCC"));
    messageMappings.put(Code._400_CAN_NOT_CREATE_UNCOMPLETED_PURCHASE_ORDER,
      Map.of("en",
        "Can not create invoice with umcompleted purchase order",
        "vi",
        "Không thể tạo hóa đơn với đơn hàng chưa hoàn tất"));
    messageMappings.put(Code._400_CAN_NOT_CREATE_WITH_CREATED_SKU,
      Map.of("en",
        "Can not create invoice with created sku",
        "vi",
        "Không thể tạo hóa đơn, sku của đơn hàng đã được tạo trước đó"));

    messageMappings.put(Code._400_CAN_NOT_CREATE_WITH_INVALID_RELATED_INVOICE_NUMBER,
      Map.of("en",
        "Can not create invoice with invalid related invoice number",
        "vi",
        "Không thể tạo hóa đơn điều chỉnh, thiếu thông tin số hoá đơn điều chỉnh"));

    messageMappings.put(Code._400_ORIGIN_NUMBER_ASSIGNED_ANOTHER_PO,
      Map.of("en",
        "Create fail! Origin number is assigned for another purchase order",
        "vi",
        "Không thể tạo hóa đơn. Số chứng từ này được gán cho đơn đặt hàng khác"));

    messageMappings.put(Code._404_INVOICE_NOT_FOUND,
      Map.of("en", "Invoice not found!", "vi", "Hoá đơn không tồn tại!"));

    messageMappings.put(Code._400_CAN_NOT_CREATE_WITH_EMPTY_LINES,
      Map.of("en", "Can not create invoice with empty sku", "vi", "Thông tin SKU không hợp lệ. Vui lòng kiểm tra lại"));

    messageMappings.put(Code._400_CAN_NOT_CREATE_PO_VIRTUAL_WITH_EMPTY_LINES,
      Map.of("en",
        "Can not create purchaseorder virtual with empty sku",
        "vi",
        "Thông tin SKU không hợp lệ. Vui lòng kiểm tra lại"));
    messageMappings.put(Code._400_AREA_NOT_SAME_OLD_AREA,
      Map.of("en",
        "New area is not the same old area",
        "vi",
        "Khu vực giao hàng của kho ảo NCC không tương ứng với vùng miền của gói hàng cũ"));

    messageMappings.put(Code._400_CAN_NOT_CREATE_WITH_INVALID_PURCHASE_ORDER_LINE,
      Map.of("en",
        "Can not create invoice with invalid purchase order line",
        "vi",
        "Không thể tạo hóa đơn, sku không hợp lệ"));
    messageMappings.put(Code._404_INVOICE_QTY_EXCEED_TOTAL_QTY,
      Map.of("en",
        "Invoice quantity is exceed total quantity",
        "vi",
        "Số lượng của SKU không hợp lệ. Vui lòng kiểm tra lại"));

    messageMappings.put(Code._404_ORIGIN_INVOICE_NUMBER_INVALID,
      Map.of("en",
        "Origin invoice number invalid. please check again",
        "vi",
        "Thông tin hoá đơn gốc không hợp lệ. Vui lòng kiểm tra lại"));

    messageMappings.put(Code._400_SOP_IS_CREATED_BY_ANOTHER_PO,
      Map.of("en",
        "This sale order package is created by another purchase order",
        "vi",
        "Gói hàng đã được tạo PO. Vui lòng kiểm tra lại"));

    messageMappings.put(Code._400_SKU_HAS_ALREADY_EXISTED_IN_PENDING_STOCK_TRANSFER,
      Map.of("en",
        "SKU [%s - %s] has already existed in the stock transfer request [%s] with the pending status!",
        "vi",
        "SKU [%s - %s] đã thuộc yêu cầu chuyển kho chờ duyệt khác. Vui lòng kiểm tra lại yêu cầu chuyển kho [%s]!"));

    messageMappings.put(Code._400_CANNOT_REQUEST_STOCK_TRANSFER_WITH_EMPTY_LINES,
      Map.of("en",
        "A stock transfer with empty list of skus cannot be sent to request",
        "vi",
        "Không thể gửi duyệt phiếu chuyển kho"

      ));

    messageMappings.put(Code._400_CANNOT_REQUEST_VNIS_PURCHASE_ORDER_WITH_EMPTY_LINES,
      Map.of("en",
        "A VNIS purchase order with empty list of skus cannot be sent to request",
        "vi",
        "Không thể gửi duyệt phiếu xuất tồn kho"));

    messageMappings.put(Code._400_INVOICE_USING_BY_ANOTHER,
      Map.of("en", "Origin number is using by another", "vi", "Hoá đơn gốc đang được sử dụng. Yêu cầu không hợp lệ"));

    messageMappings.put(Code._400_FAILED_TO_CANCEL_PARTNER_STOCK_TRANSFER,
      Map.of("en",
        "Failed to cancel stock transfer in the partner system!",
        "vi",
        "Huỷ phiếu chuyển kho thất bại bên hệ thống đối tác!"));

    // messageMappings.put(
    // Code._400_FAILED_TO_CREATE_PARTNER_PO_STOCK_TRANSFER,
    // Map.of(
    // "en", "Failed to approve stock transfer!",
    // "vi", "Tạo phiếu PO không thành công! Vui lòng thử lại."
    // )
    // );
    // messageMappings.put(
    // Code._400_FAILED_TO_CREATE_PARTNER_ST_STOCK_TRANSFER,
    // Map.of(
    // "en", "Failed to approve stock transfer!",
    // "vi", "Tạo phiếu ST không thành công! Vui lòng thử lại."
    // )
    // );

    messageMappings.put(Code._400_FAILED_TO_CREATE_PARTNER_ST_STOCK_TRANSFER,
      Map.of("en",
        "Failed to approve stock transfer!",
        "vi",
        "Phiếu chuyển kho duyệt không thành công. Vui lòng thử lại!"));

    messageMappings.put(Code._400_FAILED_TO_CREATE_PARTNER_PO_STOCK_TRANSFER,
      Map.of("en",
        "Failed to approve stock transfer!",
        "vi",
        "Phiếu chuyển kho duyệt không thành công. Vui lòng thử lại!"));

    messageMappings.put(Code._400_FAILED_TO_CREATE_PARTNER_SO_STOCK_TRANSFER,
      Map.of("en", "Failed to approve stock transfer!", "vi", "Tạo phiếu SO không thành công! Vui lòng thử lại."));
    messageMappings.put(Code._400_CAN_NOT_CREATE_UNFULL_POR,
      Map.of("en",
        "Can not create with purchase order return request is not full!",
        "vi",
        "Không thể tạo được hóa đơn với yêu cầu xuất trả chưa hoàn thành!"));

    messageMappings.put(Code._400_NOT_SUPPORT_PAYMENT,
      Map.of("en", "Not support payment method!", "vi", "Phương thức thanh toán không được hỗ trợ."));
    messageMappings.put(Code._400_EMPTY_BANK_CODE_WITH_BANK_TRANSFER,
      Map.of("en", "Empty bankcode with bank transfer method", "vi", "Mã ngân hàng rỗng với hình thức chuyển khoản"));

    messageMappings.put(Code._400_EMPTY_TRANSFER_PAYMENT_CODE_WITH_TRANSFER_PAYMENT,
      Map.of("en",
        "Empty transfer payment code with transfer payment method",
        "vi",
        "Mã giao dịch cấn trừ rỗng với hình thức cấn trừ đơn hàng"));
    messageMappings.put(Code._400_PAID_EXCEED_TOTAL,
      Map.of("en", "amount paid is exceed to total", "vi", "Số tiền thanh toán vượt qua doanh thu đơn hàng"));
    messageMappings.put(Code._400_PENDING_INVOICE,
      Map.of("en",
        "Can not create payment with pending invoice",
        "vi",
        "Không thể tạo thanh toán với đơn hàng chưa được duyệt"));

    messageMappings.put(Code._400_PAID_INVOICE,
      Map.of("en",
        "Can not create payment with paid invoice",
        "vi",
        "Không thể tạo thanh toán với đơn hàng đã thanh toán toàn phần"));

    messageMappings.put(Code._400_NOT_ENOUGH_AVAILABLE_QUANTITY_STOCK_TRANSFER,
      Map.of("en",
        "Not enough quantity to transfer",
        "vi",
        "Số lượng tồn khả dụng không đủ để thực hiện chuyển kho. Vui lòng kiểm tra lại!"));

    messageMappings.put(Code._400_ETON_EVENT_NAME_NOT_SUPPORT,
      Map.of("en", "This event doesn't support", "vi", "Sự kiện không hỗ trợ"));

    messageMappings.put(Code._400_INVALID_PURCHASE_ORDER_RETURN_LINE_SKU,
      Map.of("en", "This SKU is invalid", "vi", "SKU không hợp lệ. Vui lòng kiểm tra lại"));

    messageMappings.put(Code._400_INVALID_PURCHASE_ORDER_RETURN_DATA,
      Map.of("en", "Your data is invalid", "vi", "Yêu cầu không hợp lệ. Vui lòng thử lại"));

    messageMappings.put(Code._400_INVALID_PURCHASE_ORDER_VNIS_DATA,
      Map.of("en", "Your data is invalid", "vi", "Thông tin nhập không hợp lệ. Vui lòng kiểm tra lại"));

    messageMappings.put(Code._400_INVALID_PURCHASE_ORDER_RETURN_LINE_QUANTITY,
      Map.of("en", "Return quantity is invalid", "vi", "Số lượng trả không hợp lệ. Vui lòng kiểm tra lại"));

    messageMappings.put(Code._400_INVALID_PURCHASE_ORDER_VNIS_LINE_QUANTITY,
      Map.of("en",
        "Not enough quantity to release inventory",
        "vi",
        "Số lượng tồn khả dụng không đủ để thực hiện xuất tồn kho. Vui lòng kiểm tra lại!"));

    messageMappings.put(Code._400_INVALID_CONDITION_TYPE,
      Map.of("en", "Condition type is invalid", "vi", "Loại hàng không xuất tồn không hợp lệ. Vui lòng kiểm tra lại"));

    messageMappings.put(Code._400_CANCELLED_STOCK_TRANSFER_REQUEST,
      Map.of("en", "Stock transfer has been cancelled", "vi", "Phiếu chuyển kho đã bị huỷ"));

    messageMappings.put(Code._400_DONE_STOCK_TRANSFER_REQUEST,
      Map.of("en", "Stock transfer has been done", "vi", "Phiếu chuyển kho đã hoàn thành"));

    messageMappings.put(Code._404_ADDRESS_NOT_FOUND, Map.of("en", "Address not found", "vi", "Không tìm thấy địa chỉ"));

    messageMappings.put(Code._400_EMPTY_CART, Map.of("en", "Your cart is empty", "vi", "Giỏ hàng của bạn trống"));

    messageMappings.put(Code._400_INVALID_STOCK_TRANSFER_REQUEST_DATA,
      Map.of("en", "Your data is invalid", "vi", "Yêu cầu không hợp lệ. Vui lòng thử lại"));

    messageMappings.put(Code._400_ALREADY_RECEIVED_SO_PACKED_EVENT,
      Map.of("en",
        "Each stock transfer request only received one webhook SaleOrder Packed",
        "vi",
        "Mỗi phiếu chuyển kho chỉ cho phép nhận một webhook SaleOrder Packed"));

    messageMappings.put(Code._400_STR_QUANTITY_EXCEED_ORDERED_QUANTITY,
      Map.of("en",
        "Quantity exceeds actual ordered quantity",
        "vi",
        "Số lượng sản phẩm vượt quá số lượng sản phẩm được đặt hàng thực tế"));

    messageMappings.put(Code._400_STR_PACKED_QUANTITY_EXCEED_ORDERED_QUANTITY,
      Map.of("en",
        "Packed quantity exceeds actual ordered quantity",
        "vi",
        "Số lượng sản phẩm đóng gói vượt quá số lượng sản phẩm được đặt hàng thực tế"));

    messageMappings.put(Code._400_UNSUPPORTED_UPLOAD_FILE_TYPE,
      Map.of("en", "Unsupported upload file type", "vi", "Định dạng file tải lên không được hỗ trợ"));

    messageMappings.put(Code._400_WEAK_PASSWORD,
      Map.of("en",
        "Password length must greater or equal to 8 and must contains at least one uppercase character, one " +
          "lowercase" + " character, one number and one special character",
        "vi",
        "Độ dài mật khẩu phải lớn hơn hoặc bằng 8 ký tự và phải có ít nhất một ký tự viết hoa, một ký tự viết thường,"
          + " một số và một ký tự đặc biệt"));

    messageMappings.put(Code._400_INVALID_STOCK_TRANSFER_LINE_QUANTITY,
      Map.of("en", "Invalid stock transfer line quantity", "vi", "Số lượng SKU chuyển kho thực tế không hợp lệ"));

    messageMappings.put(Code._400_INVALID_STATUS_TO_CONFIRM_TRANSFER_IN_OR_OUT,
      Map.of("en",
        "Invalid status to manually confirm stock transfer request",
        "vi",
        "Trạng thái không hợp lệ để thực hiện xác nhận phiếu yêu cầu chuyển kho"));

    messageMappings.put(Code._400_INVALID_STATUS_TO_SYNC_STOCK_TRANSFER_REQUEST,
      Map.of("en",
        "Invalid status to synchronize stock transfer request to partner system",
        "vi",
        "Trạng thái không hợp lệ để thực hiện đồng bộ sang hệ thống đối tác"));

    messageMappings.put(Code._400_INVALID_STATUS_TO_UPDATE_STOCK_TRANSFER_REQUEST,
      Map.of("en",
        "Invalid status to update stock transfer request",
        "vi",
        "Không thể cập nhật yêu cầu chuyển kho với trạng thái khác \"Tạo mới\""));

    messageMappings.put(Code._400_INVALID_STATUS_TO_CANCEL_STOCK_TRANSFER_REQUEST,
      Map.of("en",
        "Invalid status to update stock transfer request",
        "vi",
        "Không thể huỷ yêu cầu chuyển kho với trạng thái khác \"Chờ xuất kho\""));

    messageMappings.put(Code._400_INVALID_STATUS_TO_APPROVE_STOCK_TRANSFER_REQUEST,
      Map.of("en",
        "Invalid status to approve stock transfer request",
        "vi",
        "Trạng thái không hợp lệ để phê duyệt yêu cầu chuyển kho"));

    messageMappings.put(Code._400_EMPTY_PORR_LINES,
      Map.of("en", "SKU must not be blank or empty", "vi", "Thông tin SKU không được để trống. Vui lòng kiểm tra lại"));

    messageMappings.put(Code._400_NOT_BOD_MERCHANT,
      Map.of("en", "This merchant does not support BOD", "vi", "Nhà cung cấp không hỗ trợ cung ứng hàng BOD"));

    messageMappings.put(Code._400_AUTO_DELIVERY_MERCHANT,
      Map.of("en",
        "Create fail auto delivery vnis with merchant is auto delivery",
        "vi",
        "Không thể tạo cấu hình tự động gán vận chuyển vnis với nhà cung cấp tự giao hàng BOD"));

    messageMappings.put(Code._400_EXISTED_URL,
      Map.of("en", "URL existed!. Please try again!", "vi", "URL đã tồn tại. Vui lòng kiểm tra lại!"));

    messageMappings.put(Code._400_EXISTED_URL_LANDING_PAGE,
      Map.of("en",
        "URL Landing page existed. Please try again!",
        "vi",
        "URL Landing Page đã tồn tại. Vui lòng kiểm tra lại!"));

    messageMappings.put(Code._400_CAN_NOT_DEACTIVE_TRANSPORT_INFORMATION,
      Map.of("en",
        "Can not deactive. Has inventory in warehouse",
        "vi",
        "Hiện tại Kho NCC đang còn tồn và các nghiệp vụ xử lý liên quan tồn kho. Vậy bạn không thể thay đổi thông " + "tin" + " này."));

    messageMappings.put(Code._400_DELIVERY_FEE_CONFIGURATION_IN_DETAIL_AREA_TYPE_HAS_ALREADY_EXISTED,
      Map.of("en",
        "Delivery fee configuration has already existed!",
        "vi",
        "Tham số phí giao hàng đã tồn tại, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_INVALID_STATUS_TO_VOID_DELIVERY_FEE_CONFIGURATION,
      Map.of("en",
        "Invalid status to lock delivery fee configuration",
        "vi",
        "Trạng thái không hợp lệ để khoá phí giao hàng"));

    messageMappings.put(Code._400_SPECIFIC_DELIVERY_FEE_CONFIGURATION_NOT_FOUND,
      Map.of("en",
        "Delivery fee configuration not found",
        "vi",
        "Tham số phí giao hàng cho khu vực này chưa được khai báo"));

    messageMappings.put(Code._500_MISSING_DELIVERY_FEE_CONFIGURATION_BOUNDARY,
      Map.of("en", "Delivery fee boundary do not configure yet", "vi", "Hệ thống chưa cấu hình tham số phí giao hàng"));

    messageMappings.put(Code._500_INVALID_DELIVERY_SETTINGS,
      Map.of("en", "Invalid delivery settings", "vi", "Hệ thống chưa cấu hình thông số giao hàng"));

    messageMappings.put(Code._400_INVALID_STATUS_TO_ASSIGN_WAYBILL_TO_SOP,
      Map.of("en",
        "Sale order package's status is not valid to assign waybill information",
        "vi",
        "Trạng thái gói hàng không hợp lệ"));

    messageMappings.put(Code._400_INVALID_SOP_TYPE_AND_DELIVERY_OPERATOR_TO_CHANGE_STATUS,
      Map.of("en",
        "You cannot change sale order package's status",
        "vi",
        "Không thể cập nhật trạng thái gói hàng kho ảo"));

    messageMappings.put(Code._400_INVALID_CURRENT_SOP_STATUS_TO_CHANGE,
      Map.of("en",
        "Current sale order package's status is not valid to change",
        "vi",
        "Trạng thái hiện tại không hợp lệ"));

    messageMappings.put(Code._400_INVALID_NEW_SOP_STATUS_TO_CHANGE,
      Map.of("en",
        "New sale order package's status is not valid to change",
        "vi",
        "Trạng thái tiếp theo không hợp lệ"));

    messageMappings.put(Code._400_MISSING_DELIVERY_PROVIDER_TO_UPDATE_SOP_STATUS,
      Map.of("en",
        "Delivery provider is required",
        "vi",
        "Nhà vận chuyển là bắt buộc đối với đơn vị vận chuyển là NCC tự giao và trạng thái mới là Đang giao/Đã giao"));

    messageMappings.put(Code._404_SKU_NOT_EXISTS_IN_SOP,
      Map.of("en", "Sku does not exists in sale order package", "vi", "SKU không tồn tại trong gói hàng"));

    messageMappings.put(Code._400_SOP_QUANTITY_EXCEED_ORDERED_QUANTITY,
      Map.of("en",
        "Quantity exceeds actual ordered quantity",
        "vi",
        "Số lượng sản phẩm vượt quá số lượng sản phẩm được đặt hàng thực tế"));

    messageMappings.put(Code._400_SOP_PACKED_QUANTITY_EXCEED_ORDERED_QUANTITY,
      Map.of("en",
        "Packed quantity exceeds actual ordered quantity",
        "vi",
        "Số lượng sản phẩm đóng gói vượt quá số lượng sản phẩm được đặt hàng thực tế"));

    messageMappings.put(Code._400_INVALID_STATUS,
      Map.of("en", "Invalid status", "vi", "Trạng thái gói hàng không hợp lệ"));

    messageMappings.put(Code._400_INVALID_STATUS_TO_CANCEL_SOP,
      Map.of("en",
        "Invalid status to cancel sale order package",
        "vi",
        "Trạng thái gói hàng không hợp lệ để tạo yêu cầu huỷ trả, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_INVALID_STATUS_TO_RETURN_SOP,
      Map.of("en",
        "Invalid status to return sale order package",
        "vi",
        "Trạng thái gói hàng không hợp lệ để tạo yêu cầu huỷ trả, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_EXISTS_PROCESSING_REFUND,
      Map.of("en",
        "Exists processing refund",
        "vi",
        "Đã tồn tại yêu cầu hủy trả trạng thái Chờ bổ sung hướng xử lý đang gán với gói hàng"));

    messageMappings.put(Code._400_EXISTS_PENDING_REFUND,
      Map.of("en",
        "Exists processing refund",
        "vi",
        "Đã tồn tại yêu cầu hủy trả trạng thái Chờ duyệt đang gán với gói hàng"));

    messageMappings.put(Code._400_EXISTS_APPROVED_REFUND,
      Map.of("en",
        "Exists processing refund",
        "vi",
        "Đã tồn tại yêu cầu hủy trả trạng thái Phê duyệt đang gán với gói hàng"));

    messageMappings.put(Code._400_INVALID_REFUND_QUANTITY,
      Map.of("en", "Invalid refund quantity", "vi", "Số lượng yêu cầu hủy trả vượt quá số lượng chưa trả trên gói"));

    messageMappings.put(Code._400_INVALID_RETURN_WAREHOUSE,
      Map.of("en", "Invalid return warehouse", "vi", "Kho trả không hợp lệ"));

    messageMappings.put(Code._400_INVALID_RETURN_TYPE,
      Map.of("en", "Invalid return type", "vi", "Loại trả hàng không hợp lệ"));

    messageMappings.put(Code._400_CANNOT_DECLINE_SOP_WITH_AUTO_DELIVERY,
      Map.of("en",
        "You cannot decline to deliver this sale order package",
        "vi",
        "Chỉ có thể từ chối giao hàng với gói hàng chờ đóng gói và có đơn vị vận chuyển là NCC tự giao"));
    messageMappings.put(Code._400_EMPTY_SKUS, Map.of("en", "Empty sku lines", "vi", "Thông tin sản phẩm không hợp lệ"));

    messageMappings.put(Code._400_EMPTY_PAYMENT,
      Map.of("en", "Empty payments", "vi", "Thông tin thanh toán không hợp lệ"));

    messageMappings.put(Code._400_ACTION_AND_WAREHOUSE_TYPE_INVALID,
      Map.of("en", "Action and warehouse type invalid", "vi", "Loại tạo mới và loại kho không hợp lệ"));

    messageMappings.put(Code._404_NOT_FOUND_REFUND_REQUEST,
      Map.of("en", "Refund request not found", "vi", "Mã yêu cầu hủy trả không tồn tại"));

    messageMappings.put(Code._400_INVALID_STATUS_REFUND_REQUEST,
      Map.of("en", "Refund request does not approved", "vi", "Mã yêu cầu hủy trả có trạng thái khác Phê duyệt"));

    messageMappings.put(Code._400_INVALID_SOLUTION_REFUND_REQUEST,
      Map.of("en",
        "Refund request solution does not include recreate",
        "vi",
        "Mã yêu cầu hủy trả không có hướng xử lý Tạo đơn mới"));

    messageMappings.put(Code._400_NO_CLEARING_DEBT_WITH_RECREATE_ACTION,
      Map.of("en",
        "Action recreate but not found clearing debt payment method",
        "vi",
        "Loại tạo lại đơn nhưng không tồn tại phương thức thanh toán cấn trừ công nợ"));

    messageMappings.put(Code._400_INVALID_PAYMENT_AMOUNT,
      Map.of("en",
        "Invaliad payment amount",
        "vi",
        "Tổng tiền cần thanh toán phải bằng Tổng giá trị thanh toán của tất cả hình thức đã chọn"));

    messageMappings.put(Code._400_RECREATE_AMOUNT_EXCEED_PAYMENT_AMOUNT,
      Map.of("en",
        "Recreate amount exceed total amount",
        "vi",
        "Giá trị cấn trừ từ đơn hàng cũ > Tổng tiền cần thanh toán của đơn"));

    messageMappings.put(Code._400_ORDER_REFUND_REQ_USING_BY_ANOTHER,
      Map.of("en",
        "Order refund request is using by another",
        "vi",
        "Mã yêu cầu hủy đã được sử dụng tạo đơn trước đó"));

    messageMappings.put(Code._400_EDITABLE_GREATER_THAN_ORIGIN_VALUE,
      Map.of("en",
        "Editable value is not greater than origin",
        "vi",
        "Giá trị sau edit không được phép lớn hơn giá trị ban đầu"));

    messageMappings.put(Code._400_CANNOT_SET_DEFAULT_ADDRESS,
      Map.of("en",
        "This address is default, you must be set another address to default",
        "vi",
        "Địa chỉ này đang được đặt làm mặc định, phải đặt lại địa chỉ khác làm mặc định trước"));

    messageMappings.put(Code._400_CANNOT_DELETE_DEFAULT_ADDRESS,
      Map.of("en",
        "This address is default, you cannot delete it",
        "vi",
        "Địa chỉ này đang được đặt làm mặc định, bạn không được phép xoá"));

    messageMappings.put(Code._400_BILLING_INFORMATION_TAX_NUMBER_ALREADY_EXISTS,
      Map.of("en",
        "This tax number has already existed in another billing information",
        "vi",
        "Danh bạ hóa đơn đã tồn tại. Vui lòng kiểm tra lại"));

    messageMappings.put(Code._400_INVALID_STATUS_TO_UPDATE_BILLING_INFORMATION_IN_SALE_ORDER,
      Map.of("en",
        "Cannot update billing information to cancelled or delivered order",
        "vi",
        "Không được phép cập nhật thông tin xuất hoá đơn đối với đơn hàng đã huỷ hoặc đã giao"));

    messageMappings.put(Code._404_BILLING_INFORMATION_NOT_FOUND,
      Map.of("en", "Billing information not found", "vi", "Bản ghi danh bạ xuất hoá đơn không tồn tại"));

    messageMappings.put(Code._404_NOT_FOUND_CUSTOMER_CARE_EMPLOYEE,
      Map.of("en", "Customer care employee not found", "vi", "Giá trị NVCS mới không tồn tại"));

    messageMappings.put(Code._400_INVALID_STATUS_CUSTOMER_CARE_EMPLOYEE,
      Map.of("en", "Customer care employee status is invalid", "vi", "NVCS mới có trạng thái khác Hoạt động"));

    messageMappings.put(Code._400_INVALID_POLICY_CUSTOMER_CARE_EMPLOYEE,
      Map.of("en",
        "Customer care employee policy is invalid",
        "vi",
        "NVCS mới chưa được phân quyền chức năng quản lý đơn hàng"));

    messageMappings.put(Code._400_THE_SAME_BEFORE_CUSTOMER_CARE_EMPLOYEE,
      Map.of("en", "The new must be not the old", "vi", "NVCS mới phải khác NVCS cũ"));

    messageMappings.put(Code._400_INVALID_REQUEST_TO_CREATE_VIRTUAL_POR,
      Map.of("en",
        "Invalid request to create virtual purchase order return",
        "vi",
        "Yêu cầu không hợp lệ. Vui lòng thử lại"));

    // Voucher error
    messageMappings.put(Code._400_INVALID_VOUCHER, Map.of("en", "Invalid voucher", "vi", "Mã giảm giá không hợp lệ"));

    messageMappings.put(Code._400_MORE_THAN_1_SHIPPING_VOUCHER,
      Map.of("en",
        "You are using more than 1 shipping voucher for 1 order",
        "vi",
        "Bạn đang sử dụng nhiều hơn 1 shipping voucher cho 1 đơn hang"));

    messageMappings.put(Code._400_DUPLICATE_WAYBILL_CODE,
      Map.of("en",
        "This waybill code has already existed for the delivery provider %s",
        "vi",
        "Mã vận chuyển đã tồn tại ở nhà vận chuyển %s. Vui lòng kiểm tra lại"));

    messageMappings.put(Code._404_NOT_FOUND_SPONSOR,
      Map.of("en", "Sponsor not found", "vi", "Nhà tài trợ không tồn tại"));

    messageMappings.put(Code._400_INVALID_SPONSOR,
      Map.of("en", "Sponsor is not valid", "vi", "Nhà tài trợ không hợp lệ"));

    messageMappings.put(Code._400_EMPTY_SKU_FOR_GIFT_TYPE,
      Map.of("en", "List sku quantity is empty", "vi", "Danh sách cấu hình quà tặng rỗng"));

    messageMappings.put(Code._400_CAN_NOT_DELETE_USED_BUDGET_QUANTITY,
      Map.of("en",
        "Can not delete with used buget quantity",
        "vi",
        "Không thể xóa cấu hình số lượng sản phẩm đã sử dụng"));

    messageMappings.put(Code._400_NEW_QUANTITY_LESS_THAN_AVAILABLE_QUANTITY,
      Map.of("en",
        "Can not update with new quantity less than available quantity",
        "vi",
        "Không thể cập cấu hình số lượng sản phẩm với số lượng nhỏ hơn số lượng còn lại"));

    messageMappings.put(Code._400_INVALID_STATUS_TO_REJECT_ORDER_REFUND,
      Map.of("en",
        "Invalid status to reject order refund",
        "vi",
        "Trạng thái không hợp lệ để từ chối giao dịch hoàn tiền"));

    messageMappings.put(Code._400_INVALID_STATUS_TO_APPROVE_ORDER_REFUND,
      Map.of("en",
        "Invalid status to approve order refund",
        "vi",
        "Trạng thái không hợp lệ để phê duyệt giao dịch hoàn tiền"));

    messageMappings.put(Code._400_INVALID_STATUS_TO_CONFIRM_ORDER_REFUND,
      Map.of("en",
        "Invalid status to confirm order refund",
        "vi",
        "Trạng thái không hợp lệ để hoàn thành giao dịch hoàn tiền"));

    messageMappings.put(Code._400_INVALID_STATUS_TO_UPDATE_ORDER_REFUND,
      Map.of("en",
        "Invalid status to update order refund",
        "vi",
        "Trạng thái không hợp lệ để cập nhật giao dịch hoàn tiền"));

    messageMappings.put(Code._400_INVALID_REFUND_METHOD_TO_UPDATE_ORDER_REFUND,
      Map.of("en",
        "Invalid refund method to update order refund",
        "vi",
        "Hình thức hoàn tiền không hợp lệ để cập nhật giao dịch hoàn tiền"));

    messageMappings.put(Code._400_EXISTED_REFUND_BANK_TRANSACTION_ID,
      Map.of("en", "Refund bank transaction id has already existed", "vi", "Mã GD hoàn tiền tại NH đã tồn tại"));

    messageMappings.put(Code._400_INVALID_REFUND_PAYMENT_CONFIRM_DATE,
      Map.of("en", "Invalid refund payment confirmation date", "vi", "Ngày hoàn tiền thành công phải >= Ngày tạo GD"));

    messageMappings.put(Code._400_DO_NOT_EXIST_OR_EXCEED_TOTAL_PAID_TO_REFUND,
      Map.of("en",
        "There is no payment transaction or the total refund amount exceed total paid amount to be refunded",
        "vi",
        "Không tồn tại giao dịch được hoàn tiền hoặc vượt quá tổng tiền có thể hoàn"));

    messageMappings.put(Code._400_DO_NOT_SUPPORT_MANUALLY_REFUND_PAYMENT_METHOD,
      Map.of("en",
        "This payment method is not supported to refund manually",
        "vi",
        "Hình thức hoàn tiền không hỗ trợ xác nhận thủ công"));

    messageMappings.put(Code._400_EXCEED_MAX_REFUNDABLE_AMOUNT,
      Map.of("en",
        "The total refund amount exceeds maximum of refundable amount",
        "vi",
        "Tổng giá trị cần hoàn không hợp lệ, vui lòng kiểm tra"));

    messageMappings.put(Code._400_INVALID_STATUS_APPROVE,
      Map.of("en",
        "Can not approve request. Request is approved before.",
        "vi",
        "Không thể phê duyệt yêu cầu. Yêu cầu đã được phê duyệt trước đó"));

    messageMappings.put(
      Code._400_INVALID_STATUS_TO_APPROVE_ORDER_REFUND_REQUEST,
      Map.of(
        "en", "Can not approve request. Request status must be Pending",
        "vi", "Không thể phê duyệt yêu cầu. Yêu cầu có trạng thái khác Chờ duyệt"
      )
    );

    messageMappings.put(Code._400_INVALID_DAY_OF_WEEK,
      Map.of("en", "Invalid day of week", "vi", "Ngày trong tuần không hợp lệ"));

    messageMappings.put(Code._400_INVALID_DAY_OF_MONTH,
      Map.of("en", "Invalid day of month", "vi", "Ngày trong tháng không hợp lệ"));

    messageMappings.put(Code._400_START_DATE_BE_AFTER_CURRENT_DATE,
      Map.of("en",
        "Start date must be after current date",
        "vi",
        "Với CTKM diễn ra trong ngày hiện tại, thời gian bắt đầu phải >= Thời gian hiện tại"));

    messageMappings.put(Code._400_START_DATE_TIME_BE_AFTER_CURRENT_DATE_TIME,
      Map.of("en",
        "Start date time must be after current date time",
        "vi",
        "Với CTKM diễn ra trong ngày hiện tại, thời gian bắt đầu khung giờ phải >= Thời gian hiện tại"));

    messageMappings.put(Code._400_START_DATE_BE_AFTER_CURRENT_DATE_FLASHSALE,
      Map.of("en",
        "Start date must be after current date",
        "vi",
        "Với Flash sale diễn ra trong ngày hiện tại, Thời gian bắt đầu phải >= Thời gian hiện tại"));

    messageMappings.put(Code._400_START_DATE_TIME_BE_AFTER_CURRENT_DATE_TIME_FLASHSALE,
      Map.of("en",
        "Start date time must be after curent date time",
        "vi",
        "Với Flash sale diễn ra trong ngày hiện tại, thời gian bắt đầu khung giờ phải >= Thời gian hiện tại"));

    messageMappings.put(Code._400_START_DATE_BE_BEFORE_END_DATE,
      Map.of("en", "Start date must be before end date", "vi", "Thời gian kết thúc phải >= Thời gian bắt đầu"));

    messageMappings.put(Code._400_PROMOTION_DATE_NOT_IN_RANGE_CAMPAIGN_DATE,
      Map.of("en",
        "Promotion date not in range campain date",
        "vi",
        "Chương trình khuyến mãi phải nằm trong khoảng thời gian hiệu lực của chiến dịch"));

    messageMappings.put(Code._400_START_TIME_BE_AFTER_CURRENT_TIME,
      Map.of("en",
        "Start date must be after curent date",
        "vi",
        "Với CTKM diễn ra trong ngày hiện tại, thời gian bắt đầu khung giờ phải >= Thời gian hiện tại"));

    messageMappings.put(Code._400_START_TIME_BE_AFTER_CAMPAIGN_START_TIME,
      Map.of("en",
        "Start date must be after campaign start date",
        "vi",
        "Thời gian bắt đầu khung giờ phải >= thời gian bắt đầu chiến dịch"));

    messageMappings.put(Code._400_END_TIME_BE_BEFORE_CAMPAIGN_END_TIME,
      Map.of("en",
        "End date must be before campaign end date",
        "vi",
        "Thời gian kết thúc khung giờ phải <= thời gian kết thúc chiến dịch"));

    messageMappings.put(Code._400_START_TIME_BE_BEFORE_END_TIME,
      Map.of("en",
        "Start date must be before end date",
        "vi",
        "Thời gian kết thúc khung giờ phải > Thời gian bắt đầu khung giờ"));

    messageMappings.put(Code._400_DUPLICATE_RANGE_TIME,
      Map.of("en", "Duplicate range time", "vi", "Không được phép khai báo trùng khung giờ"));

    messageMappings.put(Code._400_DAY_OF_MONTH_NO_IN_RANGE,
      Map.of("en",
        "Day of month not in range",
        "vi",
        "Ngày đã chọn không nằm trong khoảng thời gian hiệu lực của CTKM"));

    messageMappings.put(Code._404_CAMPAIGN_NOT_FOUND,
      Map.of("en", "Campaign not found", "vi", "Chiến dịch khuyến mãi không tồn tại"));
    messageMappings.put(Code._400_INVALID_CAMPAIGN,
      Map.of("en", "Campaign is invalid", "vi", "Chiến dịch đã vô hiệu hoặc đã kêt thúc"));

    messageMappings.put(Code._404_BUDGET_NOT_FOUND, Map.of("en", "Budget not found", "vi", "Ngân sách không tồn tại"));

    messageMappings.put(Code._400_INVALID_BUDGET, Map.of("en", "Budget is invalid", "vi", "Ngân sách không hợp lệ"));

    messageMappings.put(Code._400_SET_DEFAULT_FAIL_WITH_APPLY_FOR_COMBO,
      Map.of("en",
        "Promotion can not become default with apply for combo",
        "vi",
        "Không thể gán mặc định cho chường trình khuyến mãi combo"));

    messageMappings.put(Code._400_SET_DEFAULT_FAIL_WITH_MIN_QUANTITY_GREATER_THAN_ONE,
      Map.of("en",
        "Promotion can not become default with min quantity sku greater than 1",
        "vi",
        "Không thể gán mặc định cho chường trình khuyến mãi có đều kiện áp dụng sản phẩm lớn hơn 1"));

    messageMappings.put(Code._400_BUDGET_GREATER_THAN_AVAILABLE,
      Map.of("en", "Budget greater than available", "vi", "Ngân sách áp dụng cho CTKM phải <= Ngân sách còn lại"));

    messageMappings.put(
      Code._400_BUDGET_AMOUNT_GTE_MAX_DISCOUNT_PER_ORDER_GTE_FIXED_DISCOUNT_VALUE,
      Map.of(
        "en", "Budget amount must be greater than or equal to maximum discount amount per order and discount amount, respectively",
        "vi", "Yêu cầu ngân sách tiền áp dụng cho CTKM >= Số tiền giảm tối đa/1 đơn hàng >= Số tiền giảm"
      )
    );

    messageMappings.put(
      Code._400_BUDGET_AMOUNT_GTE_MAX_DISCOUNT_PER_ORDER_GTE_MAX_DISCOUNT_PER_BLOCK,
      Map.of(
        "en", "Budget amount must be greater than or equal to maximum discount amount per order and maximum discount amount per block, respectively",
        "vi", "Yêu cầu ngân sách tiền áp dụng cho CTKM >= Số tiền giảm tối đa/1 đơn hàng >= Số tiền giảm tối đa"
      )
    );

    messageMappings.put(
      Code._400_TOTAL_QUANTITY_GTE_MAX_GIFT_PER_ORDER_GTE_GIFT_PER_BLOCK,
      Map.of(
        "en", "Gift budget amount must be greater than or equal to maximum gift items per order and gift items per block, respectively",
        "vi", "Yêu cầu ngân sách quà tặng áp dụng cho CTKM >= Số lượng quà tặng/1 đơn hàng >= Số lượng quà tặng/1 block tính"
      )
    );

    messageMappings.put(Code._400_ETON_WEBHOOK_INVALID_WAREHOUSE,
      Map.of("en", "Invalid Eton warehouse code", "vi", "Mã kho Eton không hợp lệ"));

    messageMappings.put(Code._400_PRIORITY_SKU_NOT_IN_SKU,
      Map.of("en",
        "Priority sku not in all sku",
        "vi",
        "Mã SKU trong danh sách ưu tiên hiển thị không nằm trong danh sách mã SKU được áp dụng flash sale"));

    messageMappings.put(Code._400_CAN_NOT_UPDATE_START_DATE_HAPPEN_PROMOTION,
      Map.of("en",
        "Can not update startDate for happen promotion",
        "vi",
        "Không thể chỉnh sửa ngày bắt đầu với CTKM đang diễn ra"));

    messageMappings.put(Code._400_CAN_NOT_UPDATE_BENEFIT_HAPPEN_PROMOTION,
      Map.of("en",
        "Can not update benefit for happen promotion",
        "vi",
        "Không thể chỉnh sửa quyền lợi với CTKM đang diễn ra"));

    messageMappings.put(Code._400_EXCEED_AVAILABLE_BUDGET_AMOUNT,
      Map.of("en",
        "Apply budget amount > available budget amount %s - %s",
        "vi",
        "Ngân sách áp dụng > ngân sách còn lại của %s - %s"));

    messageMappings.put(Code._400_AVAILABLE_BUDGET_AMOUNT_MUST_BE_GREATER_THEN_ZERO,
      Map.of("en", "Budget amount must be greater than 0", "vi", "Ngân sách áp dụng phải lớn hơn 0"));

    messageMappings.put(Code._400_BUDGET_MUST_BE_GREATER_THAN_USAGE_BUDGET_AMOUNT,
      Map.of("en",
        "Budget amount must be greater than usage budget amount",
        "vi",
        "Ngân sách áp dụng của khuyến mãi giảm tiền < Ngân sách đã dùng cho CTKM"));

    messageMappings.put(Code._400_INVALID_ACTIVE_TIME,
      Map.of("en", "Invalid active time", "vi", "Vui lòng kiểm tra lại khoảng thời gian hiệu lực của %s"));

    messageMappings.put(Code._400_ACTIVE_WITH_INVALID_CHANNEL,
      Map.of("en",
        "Can not active with invalid channel",
        "vi",
        "Tồn tại nhóm điểm bán/ điểm bán Vô hiệu, vui lòng kiểm tra lại khai báo"));

    messageMappings.put(Code._400_DUPLICATE_FLASH_SALE,
      Map.of("en",
        "Duplicate active flashsale",
        "vi",
        "Đã tồn tại Flash sale hiệu lực tại ngày, khung giờ và điểm bán khai báo"));

    messageMappings.put(Code._400_INVALID_STATUS_TO_ACTIVATE_PROMOTION,
      Map.of("en", "Invalid status to activate promotion", "vi", "Chỉ được cập nhật hiệu lực các CTKM đang vô hiệu"));

    messageMappings.put(Code._400_INVALID_STATUS_TO_MAKE_VOID_PROMOTION,
      Map.of("en", "Invalid status to make void promotion", "vi", "Chỉ được cập nhật vô hiệu các CTKM đang hiệu lực"));

    messageMappings.put(Code._400_ETON_WEBHOOK_INVALID_DELIVERY_OPERATOR,
      Map.of("en", "Invalid delivery operator", "vi", "Đơn vị vận chuyển không hợp lệ"));

    messageMappings.put(Code._400_ETON_WEBHOOK_CANCELLED_SALE_ORDER_PACKAGE,
      Map.of("en", "Sale order package has been cancelled", "vi", "Gói hàng đã bị huỷ"));

    messageMappings.put(Code._400_ETON_WEBHOOK_ORDER_REFUND_REQUEST_NOT_CREATED_OR_APPROVED,
      Map.of("en",
        "Order refund request is not created or approved yet",
        "vi",
        "Gói hàng này chưa tồn tại yêu cầu huỷ trả được phê duyệt"));

    messageMappings.put(Code._400_START_TIME_BE_BEFORE_PROMOTION_START_TIME,
      Map.of("en",
        "Start date must be before promotion start date",
        "vi",
        "Thời gian bắt đầu của chiến dịch phải <= thời gian kết thúc của các CTKM trong chiến dịch"));

    messageMappings.put(Code._400_END_TIME_BE_AFTER_PROMOTION_END_TIME,
      Map.of("en",
        "End date must be after promotion end date",
        "vi",
        "Thời gian kết thúc của chiến dịch phải >= thời gian kết thúc của các CTKM trong chiến dịch"));

    messageMappings.put(Code._400_100,
      Map.of("en",
        "The number of products exceeds the allowable limit",
        "vi",
        "Số lượng sản phẩm vượt quá giới hạn cho phép"));

    messageMappings.put(Code._400_101,
      Map.of("en", "The product is no longer valid", "vi", "Sản phẩm không còn hiệu lực"));

    messageMappings.put(Code._400_102,
      Map.of("en",
        "The shopping cart contains some invalid products",
        "vi",
        "Giỏ hàng chứa 1 số sản phẩm không hợp lệ"));

    messageMappings.put(Code._400_103,
      Map.of("en",
        "The shopping cart contains some products that are out of stock or in insufficient quantity. Please check " + "your shopping cart again.",
        "vi",
        "Giỏ hàng chứa một số sản phẩm hết hàng hoặc không đủ số lượng. Vui lòng kiểm tra lại giỏ hàng của bạn."));

    messageMappings.put(Code._400_104,
      Map.of("en", "Product quantity is not enough", "vi", "Số lượng sản phẩm không đủ"));

    messageMappings.put(Code._400_105,
      Map.of("en",
        "The product quantity must be a positive integer",
        "vi",
        "Số lượng sản phẩm phải là số nguyên dương"));

    messageMappings.put(Code._400_106,
      Map.of("en",
        "The shopping cart has products whose prices have been updated. Please check the information again.",
        "vi",
        "Giỏ hàng có sản phẩm đã được cập nhật lại giá. Vui lòng kiểm tra lại thông tin."));

    messageMappings.put(Code._400_107,
      Map.of("en", "Product information could not be found", "vi", "Không tìm được thông tin sản phẩm"));

    messageMappings.put(Code._400_108,
      Map.of("en", "Combo has no main product information", "vi", "Combo không có thông tin sản phẩm chính"));

//    messageMappings.put(Code._400_109,
//      Map.of("en",
//        "Product quantities are not eligible for this promotion",
//        "vi",
//        "Số lượng sản phẩm không đủ điều kiện để áp dụng khuyến mại này"));

    messageMappings.put(Code._400_110,
      Map.of("en",
        "The shopping cart is empty or has no selected products",
        "vi",
        "Giỏ hàng trống hoặc không có sản phẩm được chọn"));

    messageMappings.put(Code._400_400,
      Map.of("en",
        "Discount purchase promotion is no longer available",
        "vi",
        "Khuyến mại mua hàng giảm giá không còn khả dụng"));

    messageMappings.put(Code._400_401,
      Map.of("en",
        "Sorry, the promotion is out of budget. Continue to pay for the order without receiving the promotion?",
        "vi",
        "Rất tiếc, khuyến mại đã hết ngân sách. Tiếp tục thanh toán đơn hàng mà không nhận khuyến mại?"));

    messageMappings.put(Code._400_402,
      Map.of("en",
        "The shopping cart contains products that are not eligible for promotion",
        "vi",
        "Giỏ hàng chứa sản phẩm không được áp dụng khuyến mại"));

    messageMappings.put(Code._400_403, Map.of("en", "Promotion has expired", "vi", "Khuyến mại quá hạn sử dụng"));

    messageMappings.put(Code._400_404,
      Map.of("en",
        "The shopping cart containing flash sale products has been disabled",
        "vi",
        "Giỏ hàng chứa sản phẩm flash sale đã bị vô hiệu"));

    messageMappings.put(Code._400_405,
      Map.of("en",
        "The shopping cart contains flash sale products that have run out of promotional quantity",
        "vi",
        "Giỏ hàng chứa sản phẩm flash sale đã hết số lượng khuyến mại"));

    messageMappings.put(Code._400_406, Map.of("en", "No product combos found", "vi", "Không tìm thấy combo sản phẩm"));

    messageMappings.put(Code._400_407, Map.of("en", "No promotions found", "vi", "Không tìm thấy khuyến mại"));

    messageMappings.put(Code._400_408, Map.of("en", "Promotion is not valid", "vi", "Khuyến mại không hợp lệ"));

    messageMappings.put(Code._400_409, Map.of("en", "Promotion has been invalidated", "vi", "Khuyến mại đã vô hiệu"));

    messageMappings.put(Code._400_410,
      Map.of("en",
        "Flash sale promotion has ended. Continue to pay for the order without receiving the promotion?",
        "vi",
        "Khuyến mạ̣i flash sale đã kết thúc. Tiếp tục thanh toán đơn hàng mà không nhận khuyến mại?"));

    messageMappings.put(Code._400_411,
      Map.of("en", "Sorry, gift %s is missing %s products", "vi", "Rất tiếc, quà tặng %s bị thiếu %s sản phẩm"));

    messageMappings.put(Code._400_412,
      Map.of("en", "Sorry, the %s gift is sold out", "vi", "Rất tiếc, quà tặng %s đã hết"));

    messageMappings.put(Code._400_450,
      Map.of("en",
        "Flash Sale promotions cannot be applied in conjunction with 1 promotion in your shopping cart.",
        "vi",
        "Khuyến mại Flash Sale không thể áp dụng cùng với 1 khuyến mãi trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_451,
      Map.of("en",
        "Flash Sale promotions cannot be applied in conjunction with 1 promotion in your shopping cart.",
        "vi",
        "Khuyến mại Flash Sale không thể áp dụng cùng với 1 khuyến mãi trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_452,
      Map.of("en",
        "Flash Sale promotions cannot be applied in conjunction with 1 promotion in your shopping cart.",
        "vi",
        "Khuyến mại Flash Sale không thể áp dụng cùng với 1 khuyến mãi trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_453,
      Map.of("en",
        "Flash Sale promotions cannot be applied in conjunction with 1 promotion in your shopping cart.",
        "vi",
        "Khuyến mại Flash Sale không thể áp dụng cùng với 1 khuyến mãi trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_454,
      Map.of("en",
        "You can only select 1 promotional discount option in your shopping cart.",
        "vi",
        "Bạn chỉ có thể lựa chọn 1 khuyến mại giảm giá lựa chọn trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_455,
      Map.of("en",
        "Selected discounts cannot be applied in conjunction with 1 promotion in your cart.",
        "vi",
        "Khuyến mại giảm giá lựa chọn không thể áp dụng cùng với 1 khuyến mãi trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_456,
      Map.of("en",
        "Selected discounts cannot be applied in conjunction with 1 promotion in your cart.",
        "vi",
        "Khuyến mại giảm giá lựa chọn không thể áp dụng cùng với 1 khuyến mãi trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_457,
      Map.of("en",
        "Selected discounts cannot be applied in conjunction with 1 promotion in your cart.",
        "vi",
        "Khuyến mại giảm giá lựa chọn không thể áp dụng cùng với 1 khuyến mãi trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_458,
      Map.of("en",
        "You can only select 1 discount for multiple products in your shopping cart.",
        "vi",
        "Bạn chỉ có thể lựa chọn 1 khuyến mại giảm giá mua nhiều sản phẩm trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_459,
      Map.of("en",
        "Multi-product discounts cannot be applied with 1 promotion in your shopping cart",
        "vi",
        "Khuyến mại giảm giá mua nhiều sản phẩm không thể áp dụng cùng với 1 khuyến mại trong giỏ hàng của bạn"));

    messageMappings.put(Code._400_460,
      Map.of("en",
        "Multi-product discounts cannot be applied with 1 Combo promotion in your shopping cart",
        "vi",
        "Khuyến mại giảm giá mua nhiều sản phẩm không thể áp dụng cùng với 1 khuyến mại Combo trong giỏ hàng của bạn"));

    messageMappings.put(Code._400_461,
      Map.of("en",
        "You can only select 1 promotional gift of your choice in your shopping cart.",
        "vi",
        "Bạn chỉ có thể lựa chọn 1 khuyến mại tặng quà lựa chọn trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_462,
      Map.of("en",
        "Selected gift promotion cannot be applied in conjunction with 1 Combo promotion in your cart",
        "vi",
        "Khuyến mại tặng quà lựa chọn không thể áp dụng cùng với 1 khuyến mại Combo trong giỏ hàng của bạn"));

    messageMappings.put(Code._400_463,
      Map.of("en",
        "Combo promotion cannot be applied with another Combo promotion due to overlapping products in the promotion",
        "vi",
        "Khuyến mại Combo không thể áp dụng cùng với 1 khuyến mại Combo khác do có sản phẩm trùng nhau trong khuyến " + "mại"));

    messageMappings.put(Code._400_500,
      Map.of("en",
        "Sorry, %s,....has run out of budget. Continue to pay for the order without receiving the promotion?",
        "vi",
        "Rất tiếc, %s,....đã hết ngân sách. Tiếp tục thanh toán đơn hàng mà không nhận khuyến mại?"));

    messageMappings.put(Code._400_501,
      Map.of("en",
        "Sorry, %s,....has run out of budget. Continue to pay for the order without receiving the promotion?",
        "vi",
        "Rất tiếc, %s,....đã hết ngân sách. Tiếp tục thanh toán đơn hàng mà không nhận khuyến mại?"));

    messageMappings.put(Code._400_502,
      Map.of("en",
        "The shopping cart contains a disabled promotion. Continue to pay for the order without receiving the " +
          "promotion?",
        "vi",
        "Giỏ hàng chứa khuyến mại đã bị vô hiệu. Tiếp tục thanh toán đơn hàng mà không nhận khuyến mại?"));

    messageMappings.put(Code._400_503,
      Map.of("en",
        "You are not eligible for the promotion. Continue to pay for the order without receiving the promotion?",
        "vi",
        "Bạn không đủ điều kiện để hưởng khuyến mại. Tiếp tục thanh toán đơn hàng mà không nhận khuyến mại?"));

    messageMappings.put(Code._400_504,
      Map.of("en",
        "Orders containing products are not eligible for promotions. Continue to pay for the order without receiving "
          + "the promotion?",
        "vi",
        "Đơn hàng chứa sản phẩm không được phép áp dụng khuyến mại. Tiếp tục thanh toán đơn hàng mà không nhận "
          + "khuyến mại?"));

    messageMappings.put(Code._400_505,
      Map.of("en",
        "Discount code is expired. Continue to pay for the order without receiving the promotion?",
        "vi",
        "Mã giảm giá quá hạn sử dụng. Tiếp tục thanh toán đơn hàng mà không nhận khuyến mại?"));

    messageMappings.put(Code._400_506,
      Map.of("en",
        "Discount codes are not applicable. Continue to pay for the order without receiving the promotion?",
        "vi",
        "Mã giảm giá không được áp dụng. Tiếp tục thanh toán đơn hàng mà không nhận khuyến mại?"));

    messageMappings.put(Code._400_507,
      Map.of("en",
        "The code has been used or has exceeded the number of uses. Continue to pay for the order without receiving " + "the promotion?",
        "vi",
        "Mã đã được sử dụng hoặc quá số lần sử dụng. Tiếp tục thanh toán đơn hàng mà không nhận " +
          "khuyến mại?"));

    messageMappings.put(Code._400_508,
      Map.of("en",
        "The number of times the discount code has been used has expired. Continue to pay for the order without " +
          "receiving the promotion?",
        "vi",
        "Số lượt sử dụng mã giảm giá đã hết. Tiếp tục thanh toán đơn hàng mà không nhận khuyến mại?"));

    messageMappings.put(Code._400_509,
      Map.of("en",
        "Invalid discount code. Continue to pay for the order without receiving the promotion?",
        "vi",
        "Mã giảm giá không hợp lệ. Tiếp tục thanh toán đơn hàng mà không nhận khuyến mại?"));

    messageMappings.put(Code._400_510,
      Map.of("en",
        "Products in the shopping cart do not have the code applied. Continue to pay for the order without receiving "
          + "the promotion?",
        "vi",
        "Sản phẩm trong giỏ hàng không được áp dụng mã. Tiếp tục thanh toán đơn hàng mà không nhận " +
        "khuyến mại?"));

    messageMappings.put(Code._400_511, Map.of("en", "Invalid Code", "vi", "Mã không hợp lệ"));

    messageMappings.put(Code._400_512,
      Map.of("en",
        "Code usage budget has expired. Continue to pay for the order without receiving the promotion?",
        "vi",
        "Ngân sách sử dụng mã đã hết. Tiếp tục thanh toán đơn hàng mà không nhận khuyến mại?"));

    messageMappings.put(Code._400_513,
      Map.of("en",
        "You have used the discount code more than the allowed number of times. Continue to pay for the order " +
 "without" + " receiving the promotion?",
        "vi",
        "Bạn đã sử dụng mã giảm giá vượt quá số lần cho phép. Tiếp tục thanh toán đơn hàng mà không "
          + "nhận khuyến mại?"));

    messageMappings.put(Code._400_514,
      Map.of("en",
        "Discount code does not exist. Continue to pay for the order without receiving the promotion?",
        "vi",
        "Mã giảm giá không tồn tại. Tiếp tục thanh toán đơn hàng mà không nhận khuyến mại?"));

    messageMappings.put(Code._400_515,
      Map.of("en",
        "The order value does not meet the conditions for applying the code. Continue to pay for the order without " + "receiving the promotion?",
        "vi",
        "Giá trị đơn hàng không thỏa mãn điều kiện áp dụng mã. Tiếp tục thanh toán đơn hàng mà không " + "nhận khuyến mại?"));

    messageMappings.put(Code._400_516,
      Map.of("en",
        "Promotion does not apply to products in the order. Continue to pay for the order without receiving the " +
          "promotion?",
        "vi",
        "Khuyến mại không áp dụng cho sản phẩm trong đơn. Tiếp tục thanh toán đơn hàng mà không nhận " +
          "khuyến mại?"));

    messageMappings.put(Code._400_517,
      Map.of("en",
        "Promotion does not apply to products in the order. Continue to pay for the order without receiving the " +
          "promotion?",
        "vi",
        "Khuyến mại không áp dụng cho sản phẩm trong đơn. Tiếp tục thanh toán đơn hàng mà không nhận " +
          "khuyến mại?"));

    messageMappings.put(Code._400_518,
      Map.of("en",
        "The discount amount of the discount code is greater than the value of your order",
        "vi",
        "Số tiền giảm của mã giảm giá đang lớn hơn giá trị đơn hàng của bạn"));

    messageMappings.put(Code._400_519,
      Map.of("en",
        "Discount codes do not apply to points of sale. Continue to pay for the order without receiving the promotion?",
        "vi",
        "Mã giảm giá không áp dụng cho điểm bán. Tiếp tục thanh toán đơn hàng mà không nhận khuyến " +
        "mại?"));

    messageMappings.put(Code._400_520,
      Map.of("en",
        "Selected promotions cannot be used in conjunction with 1 promotion in your shopping cart.",
        "vi",
        "Khuyến mại lựa chọn không thể áp dụng cùng với 1 khuyến mại trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_521,
      Map.of("en",
        "Multi-product discounts cannot be applied with 1 promotion in your shopping cart.",
        "vi",
        "Khuyến mại giảm giá mua nhiều sản phẩm không thể áp dụng cùng với 1 khuyến mại trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_522,
      Map.of("en",
        "Selected gift discounts cannot be used in conjunction with 1 promotion in your shopping cart.",
        "vi",
        "Khuyến mại giảm giá tặng quà lựa chọn không thể áp dụng cùng với 1 khuyến mại trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_523,
      Map.of("en",
        "Combo promotions cannot be applied in conjunction with 1 promotion in your shopping cart.",
        "vi",
        "Khuyến mại Combo không thể áp dụng cùng với 1 khuyến mại trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_524,
      Map.of("en",
        "Combo promotions cannot be applied in conjunction with 1 promotion in your shopping cart.",
        "vi",
        "Khuyến mại Combo không thể áp dụng cùng với 1 khuyến mại trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_525,
      Map.of("en",
        "You are only allowed to apply 1 platform-wide discount promotion per order.",
        "vi",
        "Bạn chỉ được phép áp dụng 1 khuyến mại giảm giá đơn hàng toàn sàn trên đơn hàng."));

    messageMappings.put(Code._400_526,
      Map.of("en",
        "Combo promotions cannot be applied in conjunction with 1 promotion in your shopping cart.",
        "vi",
        "Khuyến mại Combo không thể áp dụng cùng với 1 khuyến mại trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_527,
      Map.of("en",
        "Combo promotions cannot be applied in conjunction with 1 promotion in your shopping cart.",
        "vi",
        "Khuyến mại Combo không thể áp dụng cùng với 1 khuyến mại trong giỏ hàng của bạn."));

    messageMappings.put(Code._400_528,
      Map.of("en",
        "You are only allowed to apply 1 promotional discount to an order due to duplicate products in the promotion.",
        "vi",
        "Bạn chỉ được phép áp dụng 1 khuyến mại giảm giá đơn hàng do có sản phẩm trùng nhau trong khuyến mại."));

    messageMappings.put(Code._400_529,
      Map.of("en",
        "You are only allowed to apply 1 promotional discount to an order due to duplicate products in the promotion.",
        "vi",
        "Bạn chỉ được phép áp dụng 1 khuyến mại giảm giá đơn hàng do có sản phẩm trùng nhau trong khuyến mại."));

    messageMappings.put(Code._400_530,
      Map.of("en",
        "You are only allowed to apply 1 promotional discount to an order due to duplicate products in the promotion.",
        "vi",
        "Bạn chỉ được phép áp dụng 1 khuyến mại giảm giá đơn hàng do có sản phẩm trùng nhau trong khuyến mại."));

    messageMappings.put(Code._400_531,
      Map.of("en",
        "You are only allowed to apply 1 site-wide voucher per order.",
        "vi",
        "Bạn chỉ được phép áp dụng 1 phiếu mua hàng toàn sàn trên đơn hàng."));

    messageMappings.put(Code._400_532,
      Map.of("en",
        "You cannot apply a site-wide voucher along with a designated seller voucher.",
        "vi",
        "Phiếu mua hàng toàn sàn không thể áp dụng cùng với 1 phiếu mua hàng nhà bán chỉ định."));

    messageMappings.put(Code._400_533,
      Map.of("en",
        "You cannot apply a site-wide voucher along with a designated seller voucher.",
        "vi",
        "Phiếu mua hàng toàn sàn không thể áp dụng cùng với 1 khuyến mại toàn sàn khác."));

    messageMappings.put(Code._400_534,
      Map.of("en",
        "You are only allowed to apply 1 seller-designated coupon per order.",
        "vi",
        "Bạn chỉ được phép áp dụng 1 phiếu mua hàng nhà bán chỉ định trên đơn hàng."));

    messageMappings.put(Code._400_535,
      Map.of("en",
        "Designated seller voucher cannot be used in conjunction with a designated seller promotion due to duplicate "
          + "sellers.",
        "vi",
        "Phiếu mua hàng nhà bán chỉ định không thể áp dụng cùng với 1 khuyến mại nhà bán chỉ định do trùng nhà bán."));

    messageMappings.put(Code._400_536,
      Map.of("en",
        "Sorry, %s,.... not enough budget. Continue to pay for the order without receiving the promotion?",
        "vi",
        "Rất tiếc, %s,.... không đủ ngân sách. Tiếp tục thanh toán đơn hàng mà không nhận khuyến mại?"));

    messageMappings.put(Code._400_700, Map.of("en", "Cart not found", "vi", "Không tìm thấy giỏ hàng"));

    messageMappings.put(Code._400_701,
      Map.of("en",
        "The delivery address does not match your delivery area (%s). Please select your delivery address or " +
        "delivery" + " area again!",
        "vi",
        "Địa chỉ nhận hàng không đúng với khu vực nhận hàng của bạn (%s). Vui lòng chọn lại địa chỉ nhận hàng hoặc " + "khu vực nhận hàng!"));

    messageMappings.put(Code._400_702,
      Map.of("en", "Invalid minimum payment amount", "vi", "Số tiền thanh toán tối thiểu không hợp lệ"));

    messageMappings.put(Code._400_703, Map.of("en", "Order does not exist", "vi", "Đơn hàng không tồn tại"));

    messageMappings.put(Code._400_704,
      Map.of("en", "The order contains a product that does not exist", "vi", "Đơn hàng chứa sản phẩm không tồn tại"));

    messageMappings.put(Code._400_705,
      Map.of("en", "The order does not meet the minimum value", "vi", "Đơn hàng chưa đủ giá trị tối thiểu"));

    messageMappings.put(Code._400_109,
      Map.of("en",
        "Order amount must be greater than min amount %s",
        "vi",
        "Giá trị đơn hàng nhỏ hơn số tiền thanh toán tối thiểu %s"));

    messageMappings.put(Code._400_CHANNEL_IN_ACTIVE_PROMOTION_OR_FLASH_SALE,
      Map.of("en",
        "This channel is assigned in an active promotion or flash sale",
        "vi",
        "Nhóm điểm bán đang tồn tại chương trình khuyến mãi hay Flash sale đang hoạt động, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_SUB_CHANNEL_IN_ACTIVE_PROMOTION_OR_FLASH_SALE,
      Map.of("en",
        "This sub-channel is assigned in an active promotion or flash sale",
        "vi",
        "Điểm bán đang tồn tại CTKM/Flash sale đang hoạt động, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_INVALID_STATUS_TO_CALCULATE_PAYMENT_COLLECTION_FEE,
      Map.of("en",
        "Invalid status to calculate payment collection fee",
        "vi",
        "Trạng thái không hợp lệ để tính phí thu hộ theo đơn hàng"));

    messageMappings.put(Code._400_INVALID_PAYMENT_METHOD_TO_CALCULATE_PAYMENT_COLLECTION_FEE,
      Map.of("en",
        "Invalid payment method to calculate payment collection fee",
        "vi",
        "Hình thức thanh toán không hợp lệ để tính phí thu hộ theo đơn hàng"));

    messageMappings.put(Code._400_INVALID_STATUS_TO_CALCULATE_REFUND_COLLECTION_FEE,
      Map.of("en",
        "Invalid status to calculate refund collection fee",
        "vi",
        "Trạng thái không hợp lệ để tính phí thu hộ phải hoàn theo GD hoàn tiền"));

    messageMappings.put(Code._400_INVALID_REFUND_METHOD_TO_CALCULATE_REFUND_COLLECTION_FEE,
      Map.of("en",
        "Invalid refund method to calculate refund collection fee",
        "vi",
        "Hình thức hoàn tiền không hợp lệ để tính phí thu hộ phải hoàn theo GD hoàn tiền"));

    messageMappings.put(Code._400_INVALID_PRODUCT_DIMENSION,
      Map.of("en",
        "Product dimension do not declare yet!",
        "vi",
        "Thông số kích thước sản phẩm chưa được khai báo dầy đủ, vui lòng kiểm tra lại."));

    messageMappings.put(Code._400_INVALID_SETTING_TAX_SHIP,
      Map.of("en",
        "Setting tax ship is invalid",
        "vi",
        "Hệ thống đang không lấy được thông tin thuế suất Phí giao hàng, vui lòng thực hiện lại sau"));

    messageMappings.put(Code._404_SALE_ORDER_PACKAGE_NOT_FOUND,
      Map.of("en", "Sale order package is not found", "vi", "Gói hàng không tồn tại"));

    messageMappings.put(Code._404_SALE_ORDER_NOT_FOUND,
      Map.of("en", "Sale order is not found", "vi", "Đơn hàng không tồn tại"));

    messageMappings.put(Code._400_INVALID_REPORT_SEARCH_RANGE,
      Map.of("en", "Maximum search range is %s days", "vi", "Phạm vi tìm kiếm tối đa trong %s ngày"));

    messageMappings.put(Code._400_INVALID_USER_TYPE,
      Map.of("en", "Invalid user type!", "vi", "Loại người dùng không hợp lệ. Vui lòng kiểm tra lại!"));

    messageMappings.put(Code._400_INVALID_PHONE_NUMBER,
      Map.of(
        "en", "Invalid phone number",
        "vi", "Số điện thoại không hợp lệ"));

    messageMappings.put(Code._400_INVALID_SAFE_DATA,
      Map.of(
        "en", "[%s] contains content that is not compliant with security regulations",
        "vi", "[%s] chứa nội dung không hợp lệ theo quy định ANTT"));
    
    messageMappings.put(
      Code._400_RETURN_QUANTITY_EXCEED_ORDER_QUANTITY_SOP,
      Map.of(
        "en", "Return quantity exceeds ordered quantity",
        "vi", "Số lượng trả hàng vượt quá số lượng đặt hàng"
      )
    );

    return messageMappings;
  }

  /**
   * Custom code (NOT http status code) Format: <http status code>_<short description> Example: '500_INTERNAL'
   */
  public static class Code {
    public static final String _500_INTERNAL = "500_INTERNAL";
    public static final String _401_INVALID_USER = "401_INVALID_USER";
    public static final String _401_UNAUTHORIZED = "401_UNAUTHORIZED";
    public static final String _401_INVALID_CAPTCHA_TOKEN = "401_INVALID_CAPTCHA_TOKEN";
    public static final String _401_INVALID_MERCHANT = "401_INVALID_MERCHANT";
    public static final String _401_INCORRECT_USERNAME_PASSWORD = "401_INCORRECT_USERNAME_PASSWORD";
    public static final String _401_INVALID_TOKEN = "401_INVALID_TOKEN";
    public static final String _403_DENIED_USER = "403_DENIED_USER";
    public static final String _401_LOCK_USER = "401_LOCK_USER";
    public static final String _401_LOCK_ROLE = "401_LOCK_ROLE";
    public static final String _404_NOT_FOUND_USER = "404_NOT_FOUND_USER";

    public static final String _403_ACCESS_DENIED = "403_ACCESS_DENIED";
    public static final String _422_INVALID_DATA = "422_INVALID_DATA";
    public static final String _400_CANNOT_CREATE_MERCHANT = "400_CANNOT_CREATE_MERCHANT";
    public static final String _400_CANNOT_UPDATE_MERCHANT = "400_CANNOT_UPDATE_MERCHANT";
    public static final String _400_CANNOT_LOCK_MERCHANT = "400_CANNOT_LOCK_MERCHANT";
    public static final String _400_CANNOT_UNLOCK_MERCHANT = "400_CANNOT_UNLOCK_MERCHANT";
    public static final String _400_CANNOT_UPLOAD_ATTACHMENT = "400_CANNOT_UPLOAD_ATTACHMENT";
    public static final String _500_CHANGE_PASSWORD_FAIL = "500_CHANGE_PASSWORD_FAIL";
    public static final String _400_EXISTED_EMAIL = "400_EXISTED_EMAIL";
    public static final String _400_LOCKED_CUSTOMER = "400_LOCKED_CUSTOMER";
    public static final String _400_INCORRECT_OLD_PASSWORD = "400_INCORRECT_OLD_PASSWORD";
    public static final String _400_DUPLICATED_MASTER_MERCHANT_NAME = "400_DUPLICATED_MASTER_MERCHANT_NAME";
    public static final String _400_DUPLICATED_MASTER_MERCHANT_TAX_NUMBER = "400_DUPLICATED_MASTER_MERCHANT_TAX_NUMBER";

    public static final String _400_CANNOT_VOID_BRAND = "400_CANNOT_VOID_BRAND";
    public static final String _400_CANNOT_VOID_BRAND_DUE_TO_ACTIVE_PRODUCT =
    "400_CANNOT_VOID_BRAND_DUE_TO_ACTIVE_PRODUCT";
    public static final String _400_EXISTED_BRAND = "400_EXISTED_BRAND";
    public static final String _400_CANNOT_CREATE_BRAND = "400_CANNOT_CREATE_BRAND";
    public static final String _400_CANNOT_UPDATE_BRAND = "400_CANNOT_UPDATE_BRAND";

    public static final String _400_EXISTED_CHANNEL = "400_EXISTED_CHANNEL";
    public static final String _400_CANNOT_CREATE_CHANNEL = "400_CANNOT_CREATE_CHANNEL";
    public static final String _404_NOT_FOUND_CHANNEL = "404_NOT_FOUND_CHANNEL";
    public static final String _400_CONTAINS_ACTIVE_SUBCHANNEL = "400_CONTAINS_ACTIVE_CHANNEL";
    public static final String _400_CONTAINS_ACTIVE_PRODUCT = "400_CONTAINS_ACTIVE_PRODUCT";

    public static final String _400_EXISTED_SUBCHANNEL_NAME = "400_EXISTED_SUBCHANNEL_NAME";
    public static final String _400_EXISTED_SUBCHANNEL_CODE = "400_EXISTED_SUBCHANNEL_CODE";
    public static final String _404_NOT_FOUND_SUBCHANNEL = "404_NOT_FOUND_SUBCHANNEL";

    public static final String _400_CANNOT_VOID_PRODUCT_ATTRIBUTE = "400_CANNOT_VOID_PRODUCT_ATTRIBUTE";
    public static final String _400_CANNOT_VOID_PRODUCT_ATTRIBUTE_DUE_TO_ACTIVE_PRODUCT =
    "400_CANNOT_VOID_PRODUCT_ATTRIBUTE_DUE_TO_ACTIVE_PRODUCT";
    public static final String _400_EXISTED_PRODUCT_ATTRIBUTE = "400_EXISTED_PRODUCT_ATTRIBUTE";
    public static final String _400_CANNOT_CREATE_PRODUCT_ATTRIBUTE = "400_CANNOT_CREATE_PRODUCT_ATTRIBUTE";
    public static final String _400_CANNOT_UPDATE_PRODUCT_ATTRIBUTE = "400_CANNOT_UPDATE_PRODUCT_ATTRIBUTE";
    public static final String _400_THE_SAME_PASSWORD_BEFORE = "400_THE_SAME_PASSWORD_BEFORE";

    public static final String _400_CANNOT_VOID_ATTRIBUTE_GROUP = "400_CANNOT_VOID_ATTRIBUTE_GROUP";
    public static final String _400_CANNOT_VOID_ATTRIBUTE_GROUP_DUE_TO_ACTIVE_CATEGORY =
    "400_CANNOT_VOID_ATTRIBUTE_GROUP_DUE_TO_ACTIVE_CATEGORY";
    public static final String _400_EXISTED_ATTRIBUTE_GROUP = "400_EXISTED_ATTRIBUTE_GROUP";
    public static final String _400_CANNOT_CREATE_ATTRIBUTE_GROUP = "400_CANNOT_CREATE_ATTRIBUTE_GROUP";
    public static final String _400_CANNOT_UPDATE_ATTRIBUTE_GROUP = "400_CANNOT_UPDATE_ATTRIBUTE_GROUP";

    /**
     * Khi trùng barcode hoặc partnumber
     */
    public static final String _400_EXISTED_PRODUCT = "400_EXISTED_PRODUCT";
    /**
     * Khi brand không HIỆU LỰC
     */
    public static final String _400_INVALID_BRAND = "400_INVALID_BRAND";
    public static final String _400_CAN_NOT_ACTIVE_MISSING_ASSET = "400_CAN_NOT_ACTIVE_MISSING_ASSET";
    public static final String _400_CAN_NOT_ACTIVE_MISSING_PRICE = "400_CAN_NOT_ACTIVE_MISSING_PRICE";
    public static final String _400_CAN_NOT_ACTIVE_MISSING_DESCRIPTION = "400_CAN_NOT_ACTIVE_MISSING_DESCRIPTION";

    /**
     * Khi Ngành hành không HIỆU LỰC
     */
    public static final String _400_INVALID_PRODUCT_CATEGORY = "400_INVALID_PRODUCT_CATEGORY";
    /**
     * Khi Nhóm thuộc tính không HIỆU LỰC
     */
    public static final String _400_INVALID_PRODUCT_ATTRIBUTE_GROUP = "400_INVALID_PRODUCT_ATTRIBUTE_GROUP";
    /**
     * Khi bên vân hành không HIỆU LỰC
     */
    public static final String _400_INVALID_OPERATOR = "400_INVALID_OPERATOR";
    /**
     * Gửi duyệt với sản phẩm không ở trạng thái Đang Chờ Nhập
     */
    public static final String _400_REQUEST_INVALID_PRODUCT = "400_REQUEST_INVALID_PRODUCT";
    /**
     * Vô hiệu sản phẩm không ở trạng thái Hiệu lực
     */
    public static final String _400_MAKE_VOID_INVALID_PRODUCT = "400_MAKE_VOID_INVALID_PRODUCT";
    /**
     * Hiệu lực sản phẩm không ở trạng thái Vô hiệu
     */
    public static final String _400_MARK_ACTIVE_INVALID_PRODUCT = "400_MARK_ACTIVE_INVALID_PRODUCT";
    public static final String _400_CAN_NOT_ADD_VARIANT_WITH_SINGLE_PRODUCT =
      "400_CAN_NOT_ADD_VARIANT_WITH_SINGLE_PRODUCT";
    public static final String _400_CAN_NOT_UPDATE_PRICE_WITH_ACTIVE_PRODUCT =
    "400_CAN_NOT_UPDATE_PRICE_WITH_ACTIVE_PRODUCT";
    public static final String _400_CAN_NOT_DELETE_PRICE_WITH_ACTIVE_PRODUCT =
    "400_CAN_NOT_DELETE_PRICE_WITH_ACTIVE_PRODUCT";
    public static final String _400_CAN_NOT_UPDATE_PRICE_WITH_ACTIVE_VARIANT =
    "400_CAN_NOT_UPDATE_PRICE_WITH_ACTIVE_VARIANT";
    public static final String _400_CAN_NOT_DELETE_PRICE_WITH_ACTIVE_VARIANT =
    "400_CAN_NOT_DELETE_PRICE_WITH_ACTIVE_VARIANT";
    public static final String _400_CAN_NOT_UPDATE_INFO_WITH_PENDING_PRODUCT =
    "400_CAN_NOT_UPDATE_INFO_WITH_PENDING_PRODUCT";
    public static final String _400_CAN_NOT_UPDATE_INFO_WITH_PENDING_VARIANT =
    "400_CAN_NOT_UPDATE_INFO_WITH_PENDING_VARIANT";
    public static final String _400_STATUS_THE_SAME_BEFORE_STATUS = "400_STATUS_THE_SAME_BEFORE_STATUS";
    public static final String _404_NOT_FOUND_PRODUCT = "404_NOT_FOUND_PRODUCT";
    public static final String _400_CAN_NOT_CREATE_PARENT_PRODUCT_WITH_EMPTY_VARIANTS =
    "400_CAN_NOT_CREATE_PARENT_PRODUCT_WITH_EMPTY_VARIANTS";
    public static final String _400_CAN_NOT_DEACTIVE_TRANSPORT_INFORMATION =
    "400_CAN_NOT_DEACTIVE_TRANSPORT_INFORMATION";

    public static final String _400_CANNOT_VOID_PRODUCT_CATEGORY = "400_CANNOT_VOID_PRODUCT_CATEGORY";
    public static final String _400_CANNOT_VOID_PRODUCT_CATEGORY_DUE_TO_ACTIVE_PRODUCT =
    "400_CANNOT_VOID_PRODUCT_CATEGORY_DUE_TO_ACTIVE_PRODUCT";
    public static final String _400_EXISTED_PRODUCT_CATEGORY = "400_EXISTED_PRODUCT_CATEGORY";
    public static final String _400_CANNOT_CREATE_PRODUCT_CATEGORY = "400_CANNOT_CREATE_PRODUCT_CATEGORY";
    public static final String _400_CANNOT_UPDATE_PRODUCT_CATEGORY = "400_CANNOT_UPDATE_PRODUCT_CATEGORY";

    public static final String _400_EXISTED_PENDING_TASK = "400_EXISTED_PENDING_TASK";
    public static final String _400_RUN_TASK_BEFORE = "400_RUN_TASK_BEFORE";

    public static final String _400_INVALID_MERCHANT = "400_INVALID_MERCHANT";
    public static final String _400_INVALID_ATTRIBUTE_GROUP = "400_INVALID_ATTRIBUTE_GROUP";
    public static final String _400_INVALID_CHANNEL = "400_INVALID_CHANNEL";
    public static final String _400_CANNOT_VOID_SUBCHANNEL = "400_CANNOT_VOID_SUBCHANNEL";
    public static final String _400_CANNOT_UPDATE_SUBCHANNEL = "400_CANNOT_UPDATE_SUBCHANNEL";
    public static final String _400_CAN_NOT_DELETE_NOT_DRAFT_VARIANT = "400_CAN_NOT_DELETE_NOT_DRAFT_VARIANT";

    // Price
    public static final String _400_CAN_NOT_CANCEL_PRICE_WITH_STATUS_NOT_COMING =
    "400_CAN_NOT_CANCEL_PRICE_WITH_STATUS_NOT_COMING";
    public static final String _400_SALE_PRICE_BE_GREATER_THAN_LIST_PRICE = "400_SALE_PRICE_BE_GREATER_THAN_LIST_PRICE";
    public static final String _400_LIST_PRICE_BE_LESS_THAN_SALE_PRICE = "400_LIST_PRICE_BE_LESS_THAN_SALE_PRICE";
    public static final String _400_START_DATE_AFTER_END_DATE = "400_START_DATE_AFTER_END_DATE";
    public static final String _400_INVALID_STATUS_SKU = "400_INVALID_STATUS_SKU";
    public static final String _400_CAN_NOT_CREATE_SALE_PRICE_FOR_GIFT = "400_CAN_NOT_CREATE_SALE_PRICE_FOR_GIFT";
    public static final String _400_CAN_NOT_CREATE_PRICE_FROM_NO_EXISTS_FILE =
    "400_CAN_NOT_CREATE_PRICE_FROM_NO_EXISTS_FILE";
    public static final String _400_CAN_NOT_CREATE_PRODUCT_FROM_NO_EXISTS_FILE =
    "400_CAN_NOT_CREATE_PRODUCT_FROM_NO_EXISTS_FILE";

    public static final String _400_CANNOT_SYNC_PRODUCT = "400_CANNOT_SYNC_PRODUCT";

    public static final String _400_CAN_NOT_PROCESS_NOT_PENDING_FILE = "400_CAN_NOT_PROCESS_NOT_PENDING_FILE";
    public static final String _400_INVALID_HEADER_SIZE_UPDATE_PRODUCT_ATTRIBUTE_TEMPLATE =
    "400_INVALID_HEADER_SIZE_UPDATE_PRODUCT_ATTRIBUTE_TEMPLATE";
    public static final String _400_INVALID_HEADER_VALUE_UPDATE_PRODUCT_ATTRIBUTE_TEMPLATE =
    "400_INVALID_HEADER_VALUE_UPDATE_PRODUCT_ATTRIBUTE_TEMPLATE";

    public static final String _404_ATTRIBUTE_GROUP_NOT_FOUND = "404_ATTRIBUTE_GROUP_NOT_FOUND";
    public static final String _404_CATEGORY_NOT_FOUND = "400_CATEGORY_NOT_FOUND";
    public static final String _400_PARENT_CATEGORY_IS_NOT_SYNCED_YET = "400_PARENT_CATEGORY_IS_NOT_SYNCED_YET";
    public static final String _400_CATEGORY_IS_NOT_SYNCED_YET_FOR_SYNC_PRODUCT =
    "400_CATEGORY_IS_NOT_SYNCED_YET_FOR_SYNC_PRODUCT";

    public static final String _400_CANNOT_UPDATE_CATEGORY_DUE_TO_PENDING_PRODUCT =
    "400_CANNOT_UPDATE_CATEGORY_DUE_TO_PENDING_PRODUCT";
    public static final String _404_MERCHANT_NOT_FOUND = "404_MERCHANT_NOT_FOUND";

    public static final String _404_WAREHOUSE_NOT_FOUND = "404_WAREHOUSE_NOT_FOUND";
    public static final String _404_PROVIDER_NOT_FOUND = "404_PROVIDER_NOT_FOUND";
    public static final String _400_WAREHOUSE_IS_NOT_ACTIVE = "400_WAREHOUSE_IS_NOT_ACTIVE";
    public static final String _400_INVALID_WAREHOUSE = "400_INVALID_WAREHOUSE";
    public static final String _404_RECORD_NOT_FOUND = "404_RECORD_NOT_FOUND";
    public static final String _400_INVALID_SKU_TO_CREATE_OR_UPDATE_PRODUCT_SUPPLIER_INFO =
    "400_INVALID_SKU_TO_CREATE_OR_UPDATE_PRODUCT_SUPPLIER_INFO";

    // Purchase Order
    public static final String _404_NOT_FOUND_PURCHASE_ORDER = "404_NOT_FOUND_PURCHASE_ORDER";
    public static final String _404_NOT_FOUND_ACTIVE_SUPPLIER_PRICE_SKU = "404_NOT_FOUND_ACTIVE_SUPPLIER_PRICE_SKU";
    public static final String _400_CANNOT_ADD_OR_DELETE_SKU_WITH_COMPLETED =
    "400_CANNOT_ADD_OR_DELETE_SKU_WITH_COMPLETED";
    public static final String _400_CANNOT_CHANGE_TAX_OR_PRICE_SKU_WITH_UNCOMPLETED =
    "400_CANNOT_CHANGE_TAX_OR_PRICE_SKU_WITH_UNCOMPLETED";
    public static final String _400_CAN_NOT_UPDATE_INFO_WITH_PENDING_OR_WAITING_PURCHASE_ORDER =
    "400_CAN_NOT_UPDATE_INFO_WITH_PENDING_OR_WAITING_PURCHASE_ORDER";

    public static final String _400_INVALID_FILE_IMPORT_TYPE = "400_INVALID_FILE_IMPORT_TYPE";
    public static final String _404_CUSTOMER_NOT_FOUND = "404_CUSTOMER_NOT_FOUND";

    public static final String _404_CART_NOT_FOUND = "404_CART_NOT_FOUND";
    public static final String _400_INVALID_PURCHASE_ORDER_TO_RETURN = "400_INVALID_PURCHASE_ORDER_TO_RETURN";
    public static final String _400_INVALID_PURCHASE_ORDER_RETURN_TO_EXPORT_INVOICE =
    "400_INVALID_PURCHASE_ORDER_RETURN_TO_EXPORT_INVOICE";
    public static final String _400_INVALID_PURCHASE_ORDER_LINE_TO_RETURN = "400_INVALID_PURCHASE_ORDER_LINE_TO_RETURN";
    public static final String _400_QTY_TO_RETURN_GREATER_THAN_AVAILABLE_QTY =
    "400_QTY_TO_RETURN_GREATER_THAN_AVAILABLE_QTY";
    public static final String _400_VIRTUAL_WAREHOUSE_NOT_BELONG_TO_MERCHANT =
    "400_VIRTUAL_WAREHOUSE_NOT_BELONG_TO_MERCHANT";
    public static final String _400_ONLY_ACCEPT_PHYSICAL_WAREHOUSE = "400_ONLY_ACCEPT_PHYSICAL_WAREHOUSE";
    public static final String _400_GIFT_PRODUCT_IS_NOT_ALLOWED_TO_RETURN = "400_GIFT_PRODUCT_IS_NOT_ALLOWED_TO_RETURN";
    public static final String _400_PURCHASE_ORDER_LINE_TO_RETURN_DOES_NOT_EXIST =
    "400_PURCHASE_ORDER_LINE_TO_RETURN_DOES_NOT_EXIST";
    public static final String _400_FAILED_TO_CREATE_ETON_POR = "400_FAILED_TO_CREATE_ETON_POR";
    public static final String _400_CAN_NOT_FINISHED_PO_WITH_INVALID_STATUS =
    "400_CAN_NOT_FINISHED_PO_WITH_INVALID_STATUS";
    public static final String _400_CAN_NOT_INCOMING_PRODUCT_WITH_FULL_PURCHASE_ORDER =
    "400_CAN_NOT_INCOMING_PRODUCT_WITH_FULL_PURCHASE_ORDER";
    public static final String _400_CAN_NOT_INCOMING_PRODUCT_WITH_CLOSED_PURCHASE_ORDER =
    "400_CAN_NOT_INCOMING_PRODUCT_WITH_CLOSED_PURCHASE_ORDER";
    public static final String _400_CAN_NOT_INCOMING_PRODUCT_WITH_CANCELLED_PURCHASE_ORDER =
    "400_CAN_NOT_INCOMING_PRODUCT_WITH_CANCELLED_PURCHASE_ORDER";

    public static final String _400_SKU_HAS_IN_STOCK_IN_ANOTHER_VIRTUAL_WAREHOUSE =
    "400_SKU_HAS_STOCK_IN_OTHER_VIRTUAL_WAREHOUSE_PARTNER";

    public static final String _404_SKU_NOT_EXISTS_PURCHASE_ORDER = "404_SKU_NOT_EXISTS_PURCHASE_ORDER";
    public static final String _400_CAN_NOT_INCOMING_WITH_FULL_PRODUCT = "400_CAN_NOT_INCOMING_WITH_FULL_PRODUCT";
    public static final String _400_ACTUAL_QUANTITY_EXCEED_EXPECTED_QUANTITY =
    "400_ACTUAL_QUANTITY_EXCEED_EXPECTED_QUANTITY";
    public static final String _400_INVALID_ETON_SIGNATURE = "400_INVALID_ETON_SIGNATURE";
    public static final String _404_NOT_FOUND_ETON_SIGNATURE = "404_NOT_FOUND_ETON_SIGNATURE";
    public static final String _400_DUPLICATE_SKU = "400_DUPLICATE_SKU";
    public static final String _400_INVALID_STATUS_FOR_APPROVE = "400_INVALID_STATUS_FOR_APPROVE";
    public static final String _400_INVALID_STATUS_FOR_CANCEL = "400_INVALID_STATUS_FOR_CANCEL";
    public static final String _404_ORIGIN_INVOICE_NUMBER_INVALID = "404_ORIGIN_INVOICE_NUMBER_INVALID";
    public static final String _400_SOP_IS_CREATED_BY_ANOTHER_PO = "400_SOP_IS_CREATED_BY_ANOTHER_PO";
    public static final String _400_QUANTITY_EXCEED_AVAILABLE_QUANTITY = "400_QUANTITY_EXCEED_AVAILABLE_QUANTITY";
    public static final String _400_INVALID_STOCK_QUANTITY = "400_INVALID_STOCK_QUANTITY";

    // Invoices
    public static final String _400_CAN_NOT_CREATE_UNCOMPLETED_PURCHASE_ORDER =
    "400_CAN_NOT_CREATE_UNCOMPLETED_PURCHASE_ORDER";
    public static final String _400_CAN_NOT_CREATE_WITH_CREATED_SKU = "400_CAN_NOT_CREATE_WITH_CREATED_SKU";
    public static final String _400_CAN_NOT_CREATE_WITH_EMPTY_LINES = "400_CAN_NOT_CREATE_WITH_EMPTY_LINES";
    public static final String _400_CAN_NOT_CREATE_WITH_INVALID_PURCHASE_ORDER_LINE =
    "400_CAN_NOT_CREATE_WITH_INVALID_PURCHASE_ORDER_LINE";
    public static final String _400_CAN_NOT_CREATE_WITH_INVALID_RELATED_INVOICE_NUMBER =
    "400_CAN_NOT_CREATE_WITH_INVALID_RELATED_INVOICE_NUMBER";
    public static final String _400_ORIGIN_NUMBER_ASSIGNED_ANOTHER_PO = "400_ORIGIN_NUMBER_ASSIGNED_ANOTHER_PO";

    public static final String _404_INVOICE_NOT_FOUND = "404_INVOICE_NOT_FOUND";
    public static final String _404_INVOICE_QTY_EXCEED_TOTAL_QTY = "404_INVOICE_QTY_EXCEED_TOTAL_QTY";

    public static final String _400_SKU_HAS_ALREADY_EXISTED_IN_PENDING_STOCK_TRANSFER =
    "400_SKU_HAS_ALREADY_EXISTED_IN_PENDING_STOCK_TRANSFER";
    public static final String _400_CANNOT_REQUEST_STOCK_TRANSFER_WITH_EMPTY_LINES =
    "400_CANNOT_REQUEST_STOCK_TRANSFER_WITH_EMPTY_LINES";
    public static final String _400_CANNOT_REQUEST_VNIS_PURCHASE_ORDER_WITH_EMPTY_LINES =
    "400_CANNOT_REQUEST_VNIS_PURCHASE_ORDER_WITH_EMPTY_LINES";

    public static final String _400_FAILED_TO_CANCEL_PARTNER_STOCK_TRANSFER =
    "400_FAILED_TO_CANCEL_PARTNER_STOCK_TRANSFER";
    public static final String _400_FAILED_TO_CREATE_PARTNER_ST_STOCK_TRANSFER =
    "400_FAILED_TO_CREATE_PARTNER_ST_STOCK_TRANSFER";
    public static final String _400_FAILED_TO_CREATE_PARTNER_PO_STOCK_TRANSFER =
    "400_FAILED_TO_CREATE_PARTNER_PO_STOCK_TRANSFER";
    public static final String _400_FAILED_TO_CREATE_PARTNER_SO_STOCK_TRANSFER =
    "400_FAILED_TO_CREATE_PARTNER_SO_STOCK_TRANSFER";
    public static final String _400_CAN_NOT_CREATE_UNFULL_POR = "400_CAN_NOT_CREATE_UNFULL_POR";
    public static final String _400_INVOICE_USING_BY_ANOTHER = "400_INVOICE_USING_BY_ANOTHER";

    // Invoice payment
    public static final String _400_NOT_SUPPORT_PAYMENT = "400_NOT_SUPPORT_PAYMENT";
    public static final String _400_EMPTY_BANK_CODE_WITH_BANK_TRANSFER = "400_EMPTY_BANK_CODE_WITH_BANK_TRANSFER";
    public static final String _400_EMPTY_TRANSFER_PAYMENT_CODE_WITH_TRANSFER_PAYMENT =
    "400_EMPTY_TRANSFER_PAYMENT_CODE_WITH_TRANSFER_PAYMENT";
    public static final String _400_PAID_EXCEED_TOTAL = "400_PAID_EXCEED_TOTAL";
    public static final String _400_PENDING_INVOICE = "400_PENDING_INVOICE";
    public static final String _400_PAID_INVOICE = "400_PAID_INVOICE";

    public static final String _400_NOT_ENOUGH_AVAILABLE_QUANTITY_STOCK_TRANSFER =
    "400_NOT_ENOUGH_AVAILABLE_QUANTITY_STOCK_TRANSFER";
    public static final String _400_ETON_EVENT_NAME_NOT_SUPPORT = "400_ETON_EVENT_NAME_NOT_SUPPORT";

    public static final String _400_INVALID_PURCHASE_ORDER_RETURN_LINE_SKU =
    "400_INVALID_PURCHASE_ORDER_RETURN_LINE_SKU";
    public static final String _400_INVALID_PURCHASE_ORDER_VNIS_LINE_SKU = "400_INVALID_PURCHASE_ORDER_VNIS_LINE_SKU";

    public static final String _400_INVALID_PURCHASE_ORDER_RETURN_DATA = "400_INVALID_PURCHASE_ORDER_RETURN_DATA";
    public static final String _400_INVALID_PURCHASE_ORDER_VNIS_DATA = "400_INVALID_PURCHASE_ORDER_VNIS_DATA";

    public static final String _400_INVALID_PURCHASE_ORDER_RETURN_LINE_QUANTITY =
    "400_INVALID_PURCHASE_ORDER_RETURN_LINE_QUANTITY";
    public static final String _400_INVALID_PURCHASE_ORDER_VNIS_LINE_QUANTITY =
    "400_INVALID_PURCHASE_ORDER_VNIS_LINE_QUANTITY";
    public static final String _400_INVALID_CONDITION_TYPE = "400_INVALID_CONDITION_TYPE";

    public static final String _400_CANCELLED_STOCK_TRANSFER_REQUEST = "400_CANCELLED_STOCK_TRANSFER_REQUEST";
    public static final String _400_DONE_STOCK_TRANSFER_REQUEST = "400_DONE_STOCK_TRANSFER_REQUEST";
    public static final String _400_INVALID_STOCK_TRANSFER_REQUEST_DATA = "400_INVALID_STOCK_TRANSFER_REQUEST_DATA";
    public static final String _400_ALREADY_RECEIVED_SO_PACKED_EVENT = "400_ALREADY_RECEIVED_SO_PACKED_EVENT";
    public static final String _400_STR_QUANTITY_EXCEED_ORDERED_QUANTITY = "400_STR_QUANTITY_EXCEED_ORDERED_QUANTITY";
    public static final String _400_STR_PACKED_QUANTITY_EXCEED_ORDERED_QUANTITY =
    "400_STR_PACKED_QUANTITY_EXCEED_ORDERED_QUANTITY";

    public static final String _404_ADDRESS_NOT_FOUND = "404_ADDRESS_NOT_FOUND";
    public static final String _400_EMPTY_CART = "400_EMPTY_CART";

    public static final String _400_UNSUPPORTED_UPLOAD_FILE_TYPE = "400_UNSUPPORTED_UPLOAD_FILE_TYPE";
    public static final String _400_WEAK_PASSWORD = "400_WEAK_PASSWORD";
    public static final String _400_INVALID_STOCK_TRANSFER_LINE_QUANTITY = "400_INVALID_STOCK_TRANSFER_LINE_QUANTITY";
    public static final String _400_INVALID_STATUS_TO_CONFIRM_TRANSFER_IN_OR_OUT =
    "400_INVALID_STATUS_TO_CONFIRM_TRANSFER_IN_OR_OUT";
    public static final String _400_INVALID_STATUS_TO_SYNC_STOCK_TRANSFER_REQUEST =
    "400_INVALID_STATUS_TO_SYNC_STOCK_TRANSFER_REQUEST";
    public static final String _400_INVALID_STATUS_TO_UPDATE_STOCK_TRANSFER_REQUEST =
    "400_INVALID_STATUS_TO_UPDATE_STOCK_TRANSFER_REQUEST";
    public static final String _400_INVALID_STATUS_TO_CANCEL_STOCK_TRANSFER_REQUEST =
    "400_INVALID_STATUS_TO_CANCEL_STOCK_TRANSFER_REQUEST";
    public static final String _400_INVALID_STATUS_TO_APPROVE_STOCK_TRANSFER_REQUEST =
    "400_INVALID_STATUS_TO_APPROVE_STOCK_TRANSFER_REQUEST";

    public static final String _400_EMPTY_PORR_LINES = "400_EMPTY_PORR_LINES";
    public static final String _400_NOT_BOD_MERCHANT = "400_NOT_BOD_MERCHANT";
    public static final String _400_AUTO_DELIVERY_MERCHANT = "400_AUTO_DELIVERY_MERCHANT";

    public static final String _400_EXISTED_URL = "400_EXISTED_URL";
    public static final String _400_EXISTED_URL_LANDING_PAGE = "400_EXISTED_URL_LANDING_PAGE";
    public static final String _400_SKU_HAS_STOCK_IN_SAME_VIRTUAL_WAREHOUSE_PARTNER =
    "400_SKU_HAS_STOCK_IN_SAME_VIRTUAL_WAREHOUSE_PARTNER";
    public static final String _400_DECREASE_QUANTITY_EXCEED_INVENTORY_QUANTITY =
    "400_DECREASE_QUANTITY_EXCEED_INVENTORY_QUANTITY";

    public static final String _500_MS_CLIENT_ERROR = "500_MS_CLIENT_ERROR";
    public static final String _500_MS_STANDARD_ERROR = "500_MS_STANDARD_ERROR";

    public static final String _400_NOT_SUPPORT_DELIVERY_PROVIDER = "400_NOT_SUPPORT_DELIVERY_PROVIDER";
    public static final String _400_VNIS_NOT_SUPPORT_DELIVERY_PROVIDER = "400_VNIS_NOT_SUPPORT_DELIVERY_PROVIDER";
    public static final String _400_WARD_DISTRICT_PROVINCE_DUPLICATE = "400_WARD_DISTRICT_PROVINCE_DUPLICATE";
    public static final String _400_WAREHOUSE_DUPLICATE = "400_WAREHOUSE_DUPLICATE";

    public static final String _400_DELIVERY_FEE_CONFIGURATION_IN_DETAIL_AREA_TYPE_HAS_ALREADY_EXISTED =
    "400_DELIVERY_FEE_CONFIGURATION_IN_DETAIL_AREA_TYPE_HAS_ALREADY_EXISTED";
    public static final String _400_INVALID_STATUS_TO_VOID_DELIVERY_FEE_CONFIGURATION =
 "400_INVALID_STATUS_TO_VOID_DELIVERY_FEE_CONFIGURATION";
    public static final String _400_SPECIFIC_DELIVERY_FEE_CONFIGURATION_NOT_FOUND =
    "400_SPECIFIC_DELIVERY_FEE_CONFIGURATION_NOT_FOUND";
    public static final String _500_MISSING_DELIVERY_FEE_CONFIGURATION_BOUNDARY =
    "500_MISSING_DELIVERY_FEE_CONFIGURATION_BOUNDARY";
    public static final String _500_INVALID_DELIVERY_SETTINGS = "500_INVALID_DELIVERY_SETTINGS";
    public static final String _400_CAN_NOT_CREATE_PO_VIRTUAL_WITH_EMPTY_LINES =
 "400_CAN_NOT_CREATE_PO_VIRTUAL_WITH_EMPTY_LINES";
    public static final String _400_AREA_NOT_SAME_OLD_AREA = "400_AREA_NOT_SAME_OLD_AREA";

    public static final String _400_INVALID_STATUS_TO_ASSIGN_WAYBILL_TO_SOP =
 "400_INVALID_STATUS_TO_ASSIGN_WAYBILL_TO_SOP";
    public static final String _400_INVALID_SOP_TYPE_AND_DELIVERY_OPERATOR_TO_CHANGE_STATUS =
    "400_INVALID_SOP_TYPE_AND_DELIVERY_OPERATOR_TO_CHANGE_STATUS";
    public static final String _400_INVALID_CURRENT_SOP_STATUS_TO_CHANGE = "400_INVALID_CURRENT_SOP_STATUS_TO_CHANGE";
    public static final String _400_INVALID_NEW_SOP_STATUS_TO_CHANGE = "400_INVALID_NEW_SOP_STATUS_TO_CHANGE";
    public static final String _400_MISSING_DELIVERY_PROVIDER_TO_UPDATE_SOP_STATUS =
    "400_MISSING_DELIVERY_PROVIDER_TO_UPDATE_SOP_STATUS";
    public static final String _404_SKU_NOT_EXISTS_IN_SOP = "404_SKU_NOT_EXISTS_IN_SOP";
    public static final String _400_SOP_QUANTITY_EXCEED_ORDERED_QUANTITY = "400_SOP_QUANTITY_EXCEED_ORDERED_QUANTITY";
    public static final String _400_SOP_PACKED_QUANTITY_EXCEED_ORDERED_QUANTITY =
 "400_SOP_PACKED_QUANTITY_EXCEED_ORDERED_QUANTITY";
    public static final String _400_CANNOT_DECLINE_SOP_WITH_AUTO_DELIVERY = "400_CANNOT_DECLINE_SOP_WITH_AUTO_DELIVERY";

    // Order Refund
    public static final String _400_INVALID_STATUS_TO_CANCEL_SOP = "400_INVALID_STATUS_TO_CANCEL_SOP";
    public static final String _400_INVALID_STATUS_TO_RETURN_SOP = "400_INVALID_STATUS_TO_RETURN_SOP";
    public static final String _400_EXISTS_PROCESSING_REFUND = "400_EXISTS_PROCESSING_REFUND";
    public static final String _400_EXISTS_PENDING_REFUND = "400_EXISTS_PENDING_REFUND";
    public static final String _400_EXISTS_APPROVED_REFUND = "400_EXISTS_APPROVED_REFUND";
    public static final String _400_INVALID_REFUND_QUANTITY = "400_INVALID_REFUND_QUANTITY";
    public static final String _400_INVALID_RETURN_WAREHOUSE = "400_INVALID_RETURN_WAREHOUSE";
    public static final String _400_INVALID_RETURN_TYPE = "400_INVALID_RETURN_TYPE";
    public static final String _400_INVALID_STATUS = "400_INVALID_STATUS";
    public static final String _400_EXISTS_SKU_NOT_ASSIGN = "400_EXISTS_SKU_NOT_ASSIGN";
    public static final String _400_CAN_NOT_MAKE_ORDER_WITH_INVALID_VOUCHER =
    "400_CAN_NOT_MAKE_ORDER_WITH_INVALID_VOUCHER";
    public static final String _400_INIT_VOUCHER_TRANSACTION_FAIL = "400_INIT_VOUCHER_TRANSACTION_FAIL";
    public static final String _400_EXISTS_REQUEST_REFUND_SHIPPING_FEE = "400_EXISTS_REQUEST_REFUND_SHIPPING_FEE";

    // Sale Order
    public static final String _400_EMPTY_SKUS = "400_EMPTY_SKUS";
    public static final String _400_EMPTY_PAYMENT = "400_EMPTY_PAYMENT";
    public static final String _400_ACTION_AND_WAREHOUSE_TYPE_INVALID = "400_ACTION_AND_WAREHOUSE_TYPE_INVALID";
    public static final String _404_NOT_FOUND_REFUND_REQUEST = "404_NOT_FOUND_REFUND_REQUEST";
    public static final String _400_INVALID_STATUS_REFUND_REQUEST = "400_INVALID_STATUS_REFUND_REQUEST";
    public static final String _400_INVALID_SOLUTION_REFUND_REQUEST = "400_INVALID_SOLUTION_REFUND_REQUEST";
    public static final String _400_INVALID_REFUND_REQUEST = "400_INVALID_REFUND_REQUEST";
    public static final String _400_NO_CLEARING_DEBT_WITH_RECREATE_ACTION = "400_NO_CLEARING_DEBT_WITH_RECREATE_ACTION";
    public static final String _400_INVALID_PAYMENT_AMOUNT = "_400_INVALID_PAYMENT_AMOUNT";
    public static final String _400_RECREATE_AMOUNT_EXCEED_PAYMENT_AMOUNT = "400_RECREATE_AMOUNT_EXCEED_PAYMENT_AMOUNT";
    public static final String _400_ORDER_REFUND_REQ_USING_BY_ANOTHER = "400_ORDER_REFUND_REQ_USING_BY_ANOTHER";
    public static final String _400_EDITABLE_GREATER_THAN_ORIGIN_VALUE = "400_EDITABLE_GREATER_THAN_ORIGIN_VALUE";

    public static final String _400_CANNOT_SET_DEFAULT_ADDRESS = "400_CANNOT_SET_DEFAULT_ADDRESS";
    public static final String _400_CANNOT_DELETE_DEFAULT_ADDRESS = "400_CANNOT_DELETE_DEFAULT_ADDRESS";
    public static final String _400_BILLING_INFORMATION_TAX_NUMBER_ALREADY_EXISTS =
 "400_BILLING_INFORMATION_TAX_NUMBER_ALREADY_EXISTS";
    public static final String _400_INVALID_STATUS_TO_UPDATE_BILLING_INFORMATION_IN_SALE_ORDER =
 "400_INVALID_STATUS_TO_UPDATE_BILLING_INFORMATION_IN_SALE_ORDER";
    public static final String _404_BILLING_INFORMATION_NOT_FOUND = "404_BILLING_INFORMATION_NOT_FOUND";
    public static final String _404_NOT_FOUND_CUSTOMER_CARE_EMPLOYEE = "404_NOT_FOUND_CUSTOMER_CARE_EMPLOYEE";
    public static final String _400_INVALID_STATUS_CUSTOMER_CARE_EMPLOYEE = "400_INVALID_STATUS_CUSTOMER_CARE_EMPLOYEE";
    public static final String _400_INVALID_POLICY_CUSTOMER_CARE_EMPLOYEE = "400_INVALID_POLICY_CUSTOMER_CARE_EMPLOYEE";
    public static final String _400_THE_SAME_BEFORE_CUSTOMER_CARE_EMPLOYEE =
    "400_THE_SAME_BEFORE_CUSTOMER_CARE_EMPLOYEE";
    public static final String _400_INVALID_REQUEST_TO_CREATE_VIRTUAL_POR = "400_INVALID_REQUEST_TO_CREATE_VIRTUAL_POR";

    // voucher error
    public static final String _400_INVALID_VOUCHER = "400_INVALID_VOUCHER";
    public static final String _400_MORE_THAN_1_SHIPPING_VOUCHER = "400_MORE_THAN_1_SHIPPING_VOUCHER";

    public static final String _400_DUPLICATE_WAYBILL_CODE = "400_DUPLICATE_WAYBILL_CODE";

    // Budget
    public static final String _404_NOT_FOUND_SPONSOR = "404_NOT_FOUND_SPONSOR";
    public static final String _400_INVALID_SPONSOR = "400_INVALID_SPONSOR";
    public static final String _400_EMPTY_SKU_FOR_GIFT_TYPE = "400_EMPTY_SKU_FOR_GIFT_TYPE";
    public static final String _400_CAN_NOT_DELETE_USED_BUDGET_QUANTITY = "400_CAN_NOT_DELETE_USED_BUDGET_QUANTITY";
    public static final String _400_NEW_QUANTITY_LESS_THAN_AVAILABLE_QUANTITY =
    "400_NEW_QUANTITY_LESS_THAN_AVAILABLE_QUANTITY";

    // Order refund
    public static final String _400_INVALID_STATUS_TO_REJECT_ORDER_REFUND = "400_INVALID_STATUS_TO_REJECT_ORDER_REFUND";
    public static final String _400_INVALID_STATUS_TO_APPROVE_ORDER_REFUND =
    "400_INVALID_STATUS_TO_APPROVE_ORDER_REFUND";
    public static final String _400_INVALID_STATUS_TO_CONFIRM_ORDER_REFUND =
    "400_INVALID_STATUS_TO_CONFIRM_ORDER_REFUND";
    public static final String _400_INVALID_STATUS_TO_UPDATE_ORDER_REFUND = "400_INVALID_STATUS_TO_UPDATE_ORDER_REFUND";
    public static final String _400_INVALID_REFUND_METHOD_TO_UPDATE_ORDER_REFUND =
    "400_INVALID_REFUND_METHOD_TO_UPDATE_ORDER_REFUND";
    public static final String _400_EXISTED_REFUND_BANK_TRANSACTION_ID = "400_EXISTED_REFUND_BANK_TRANSACTION_ID";
    public static final String _400_INVALID_REFUND_PAYMENT_CONFIRM_DATE = "400_INVALID_REFUND_PAYMENT_CONFIRM_DATE";
    public static final String _400_DO_NOT_EXIST_OR_EXCEED_TOTAL_PAID_TO_REFUND =
    "400_DO_NOT_EXIST_OR_EXCEED_TOTAL_PAID_TO_REFUND";
    public static final String _400_DO_NOT_SUPPORT_MANUALLY_REFUND_PAYMENT_METHOD =
    "400_DO_NOT_SUPPORT_MANUALLY_REFUND_PAYMENT_METHOD";
    public static final String _400_EXCEED_MAX_REFUNDABLE_AMOUNT = "400_EXCEED_MAX_REFUNDABLE_AMOUNT";
    public static final String _400_INVALID_STATUS_APPROVE = "400_INVALID_STATUS_APPROVE";
    public static final String _400_INVALID_STATUS_TO_APPROVE_ORDER_REFUND_REQUEST = "400_INVALID_STATUS_TO_APPROVE_ORDER_REFUND_REQUEST";

    // campaign
    public static final String _400_START_TIME_BE_BEFORE_PROMOTION_START_TIME =
    "400_START_TIME_BE_BEFORE_PROMOTION_START_TIME";
    public static final String _400_END_TIME_BE_AFTER_PROMOTION_END_TIME = "400_END_TIME_BE_AFTER_PROMOTION_END_TIME";

    // promotion
    public static final String _400_INVALID_DAY_OF_WEEK = "400_INVALID_DAY_OF_WEEK";
    public static final String _400_INVALID_DAY_OF_MONTH = "400_INVALID_DAY_OF_MONTH";
    public static final String _400_START_DATE_BE_AFTER_CURRENT_DATE = "400_START_DATE_BE_AFTER_CURRENT_DATE";
    public static final String _400_START_DATE_TIME_BE_AFTER_CURRENT_DATE_TIME =
    "400_START_DATE_TIME_BE_AFTER_CURRENT_DATE_TIME";
    public static final String _400_START_DATE_BE_AFTER_CURRENT_DATE_FLASHSALE =
    "400_START_DATE_BE_AFTER_CURRENT_DATE_FLASHSALE";
    public static final String _400_START_DATE_TIME_BE_AFTER_CURRENT_DATE_TIME_FLASHSALE =
    "400_START_DATE_TIME_BE_AFTER_CURRENT_DATE_TIME_FLASHSALE";
    public static final String _400_START_DATE_BE_BEFORE_END_DATE = "400_START_DATE_BE_BEFORE_END_DATE";
    public static final String _400_PROMOTION_DATE_NOT_IN_RANGE_CAMPAIGN_DATE =
    "_400_PROMOTION_DATE_NOT_IN_RANGE_CAMPAIGN_DATE";
    public static final String _400_START_TIME_BE_AFTER_CURRENT_TIME = "400_START_TIME_BE_AFTER_CURRENT_TIME";
    public static final String _400_START_TIME_BE_AFTER_CAMPAIGN_START_TIME =
    "400_START_TIME_BE_AFTER_CAMPAIGN_START_TIME";
    public static final String _400_END_TIME_BE_BEFORE_CAMPAIGN_END_TIME = "400_END_TIME_BE_BEFORE_CAMPAIGN_END_TIME";
    public static final String _400_START_TIME_BE_BEFORE_END_TIME = "400_START_TIME_BE_BEFORE_END_TIME";
    public static final String _400_DUPLICATE_RANGE_TIME = "400_DUPLICATE_RANGE_TIME";
    public static final String _400_DAY_OF_MONTH_NO_IN_RANGE = "400_DAY_OF_MONTH_NO_IN_RANGE";
    public static final String _404_CAMPAIGN_NOT_FOUND = "404_CAMPAIGN_NOT_FOUND";
    public static final String _400_INVALID_CAMPAIGN = "400_INVALID_CAMPAIGN";
    public static final String _404_BUDGET_NOT_FOUND = "404_BUDGET_NOT_FOUND";
    public static final String _400_INVALID_BUDGET = "400_INVALID_BUDGET";
    public static final String _400_SET_DEFAULT_FAIL_WITH_APPLY_FOR_COMBO = "400_SET_DEFAULT_FAIL_WITH_APPLY_FOR_COMBO";
    public static final String _400_SET_DEFAULT_FAIL_WITH_MIN_QUANTITY_GREATER_THAN_ONE =
 "400_SET_DEFAULT_FAIL_WITH_MIN_QUANTITY_GREATER_THAN_ONE";
    public static final String _400_BUDGET_GREATER_THAN_AVAILABLE = "400_BUDGET_GREATER_THAN_AVAILABLE";
    public static final String _400_BUDGET_AMOUNT_GTE_MAX_DISCOUNT_PER_ORDER_GTE_FIXED_DISCOUNT_VALUE = "400_BUDGET_AMOUNT_GTE_MAX_DISCOUNT_PER_ORDER_GTE_FIXED_DISCOUNT_VALUE";
    public static final String _400_BUDGET_AMOUNT_GTE_MAX_DISCOUNT_PER_ORDER_GTE_MAX_DISCOUNT_PER_BLOCK = "400_BUDGET_AMOUNT_GTE_MAX_DISCOUNT_PER_ORDER_GTE_MAX_DISCOUNT_PER_BLOCK";
    public static final String _400_TOTAL_QUANTITY_GTE_MAX_GIFT_PER_ORDER_GTE_GIFT_PER_BLOCK = "400_TOTAL_QUANTITY_GTE_MAX_GIFT_PER_ORDER_GTE_GIFT_PER_BLOCK";
    public static final String _400_PRIORITY_SKU_NOT_IN_SKU = "400_PRIORITY_SKU_NOT_IN_SKU";
    public static final String _400_EXCEED_AVAILABLE_BUDGET_AMOUNT = "400_EXCEED_AVAILABLE_BUDGET_AMOUNT";
    public static final String _400_AVAILABLE_BUDGET_AMOUNT_MUST_BE_GREATER_THEN_ZERO =
    "400_AVAILABLE_BUDGET_AMOUNT_MUST_BE_GREATER_THEN_ZERO";
    public static final String _400_BUDGET_MUST_BE_GREATER_THAN_USAGE_BUDGET_AMOUNT =
    "400_BUDGET_MUST_BE_GREATER_THAN_USAGE_BUDGET_AMOUNT";
    public static final String _400_INVALID_ACTIVE_TIME = "400_INVALID_ACTIVE_TIME";
    public static final String _400_ACTIVE_WITH_INVALID_CHANNEL = "400_ACTIVE_WITH_INVALID_CHANNEL";
    public static final String _400_DUPLICATE_FLASH_SALE = "400_DUPLICATE_FLASH_SALE";
    public static final String _400_INVALID_STATUS_TO_ACTIVATE_PROMOTION = "400_INVALID_STATUS_TO_ACTIVATE_PROMOTION";
    public static final String _400_INVALID_STATUS_TO_MAKE_VOID_PROMOTION = "400_INVALID_STATUS_TO_MAKE_VOID_PROMOTION";

    public static final String _400_CAN_NOT_UPDATE_START_DATE_HAPPEN_PROMOTION =
    "400_CAN_NOT_UPDATE_START_DATE_HAPPEN_PROMOTION";
    public static final String _400_CAN_NOT_UPDATE_BENEFIT_HAPPEN_PROMOTION =
    "400_CAN_NOT_UPDATE_BENEFIT_HAPPEN_PROMOTION";

    public static final String _400_ETON_WEBHOOK_INVALID_WAREHOUSE = "400_ETON_WEBHOOK_INVALID_WAREHOUSE";
    public static final String _400_ETON_WEBHOOK_INVALID_DELIVERY_OPERATOR =
    "400_ETON_WEBHOOK_INVALID_DELIVERY_OPERATOR";
    public static final String _400_ETON_WEBHOOK_CANCELLED_SALE_ORDER_PACKAGE =
    "400_ETON_WEBHOOK_CANCELLED_SALE_ORDER_PACKAGE";
    public static final String _400_ETON_WEBHOOK_ORDER_REFUND_REQUEST_NOT_CREATED_OR_APPROVED =
    "400_ETON_WEBHOOK_ORDER_REFUND_REQUEST_NOT_CREATED_OR_APPROVED";

    public static final String _400_CHANNEL_IN_ACTIVE_PROMOTION_OR_FLASH_SALE =
    "400_CHANNEL_IN_ACTIVE_PROMOTION_OR_FLASH_SALE";
    public static final String _400_SUB_CHANNEL_IN_ACTIVE_PROMOTION_OR_FLASH_SALE =
    "400_SUB_CHANNEL_IN_ACTIVE_PROMOTION_OR_FLASH_SALE";

    public static final String _400_INVALID_SETTING_TAX_SHIP = "_400_INVALID_SETTING_TAX_SHIP";
    // Make Order Code;
    // Format mã lỗi: xxxyyy. Trong đó:
    // xxx: http code
    // yyy: business code. Quy định business code như sau:
    // yyy = 100 → 399: lỗi liên quan đến sản phẩm
    public static final String _400_100 = "400100";
    public static final String _400_101 = "400101";
    public static final String _400_102 = "400102";
    public static final String _400_103 = "400103";
    public static final String _400_104 = "400104";
    public static final String _400_105 = "400105";
    public static final String _400_106 = "400106";
    public static final String _400_107 = "400107";
    public static final String _400_108 = "400108";
    public static final String _400_109 = "400109";
    public static final String _400_110 = "400110";

    // yyy = 400 → 699: lỗi liên quan đến khuyến mại
    public static final String _400_400 = "400400";
    public static final String _400_401 = "400401";
    public static final String _400_402 = "400402";
    public static final String _400_403 = "400403";
    public static final String _400_404 = "400404";
    public static final String _400_405 = "400405";
    public static final String _400_406 = "400406";
    public static final String _400_407 = "400407";
    public static final String _400_408 = "400408";
    public static final String _400_409 = "400409";
    public static final String _400_410 = "400410";
    public static final String _400_411 = "400411";
    public static final String _400_412 = "400412";
    public static final String _400_450 = "400450";
    public static final String _400_451 = "400451";
    public static final String _400_452 = "400452";
    public static final String _400_453 = "400453";
    public static final String _400_454 = "400454";
    public static final String _400_455 = "400455";
    public static final String _400_456 = "400456";
    public static final String _400_457 = "400457";
    public static final String _400_458 = "400458";
    public static final String _400_459 = "400459";
    public static final String _400_460 = "400460";
    public static final String _400_461 = "400461";
    public static final String _400_462 = "400462";
    public static final String _400_463 = "400463";

    //Voucher System
    public static final String _400_500 = "400500";
    public static final String _400_501 = "400501";
    public static final String _400_502 = "400502";
    public static final String _400_503 = "400503";
    public static final String _400_504 = "400504";
    public static final String _400_505 = "400505";
    public static final String _400_506 = "400506";
    public static final String _400_507 = "400507";
    public static final String _400_508 = "400508";
    public static final String _400_509 = "400509";
    public static final String _400_510 = "400510";
    public static final String _400_511 = "400511";
    public static final String _400_512 = "400512";
    public static final String _400_513 = "400513";
    public static final String _400_514 = "400514";
    public static final String _400_515 = "400515";
    public static final String _400_516 = "400516";
    public static final String _400_517 = "400517";
    public static final String _400_518 = "400518";
    public static final String _400_519 = "400519";
    public static final String _400_520 = "400520";
    public static final String _400_521 = "400521";
    public static final String _400_522 = "400522";
    public static final String _400_523 = "400523";
    public static final String _400_524 = "400524";
    public static final String _400_525 = "400525";
    public static final String _400_526 = "400526";
    public static final String _400_527 = "400527";
    public static final String _400_528 = "400528";
    public static final String _400_529 = "400529";
    public static final String _400_530 = "400530";
    public static final String _400_531 = "400531";
    public static final String _400_532 = "400532";
    public static final String _400_533 = "400533";
    public static final String _400_534 = "400534";
    public static final String _400_535 = "400535";
    public static final String _400_536 = "400536";

    // yyy = 700 → 999: lỗi khác
    public static final String _400_700 = "400700";
    public static final String _400_701 = "400701";
    public static final String _400_702 = "400702";
    public static final String _400_703 = "400703";
    public static final String _400_704 = "400704";
    public static final String _400_705 = "400705";

    // Payment transaction
    public static final String _400_INVALID_STATUS_TO_CALCULATE_PAYMENT_COLLECTION_FEE =
    "400_INVALID_STATUS_TO_CALCULATE_PAYMENT_COLLECTION_FEE";
    public static final String _400_INVALID_PAYMENT_METHOD_TO_CALCULATE_PAYMENT_COLLECTION_FEE =
    "400_INVALID_METHOD_TO_CALCULATE_PAYMENT_COLLECTION_FEE";
    public static final String _400_INVALID_STATUS_TO_CALCULATE_REFUND_COLLECTION_FEE =
    "400_INVALID_STATUS_TO_CALCULATE_REFUND_COLLECTION_FEE";
    public static final String _400_INVALID_REFUND_METHOD_TO_CALCULATE_REFUND_COLLECTION_FEE =
    "400_INVALID_METHOD_TO_CALCULATE_REFUND_COLLECTION_FEE";

    public static final String _400_INVALID_PRODUCT_DIMENSION = "400_INVALID_PRODUCT_DIMENSION";

    public static final String _404_SALE_ORDER_PACKAGE_NOT_FOUND = "404_SALE_ORDER_PACKAGE_NOT_FOUND";
    public static final String _404_SALE_ORDER_NOT_FOUND = "404_SALE_ORDER_NOT_FOUND";

    public static final String _400_INVALID_REPORT_SEARCH_RANGE = "400_INVALID_REPORT_SEARCH_RANGE";
    public static final String _400_INVALID_USER_TYPE = "400_INVALID_USER_TYPE";
    public static final String _400_INVALID_PHONE_NUMBER = "400_INVALID_PHONE_NUMBER";
    public static final String _400_INVALID_SAFE_DATA = "400_INVALID_SAFE_DATA";
    public static final String _400_RETURN_QUANTITY_EXCEED_ORDER_QUANTITY_SOP = "400_RETURN_QUANTITY_EXCEED_ORDER_QUANTITY_SOP";
  }
}
