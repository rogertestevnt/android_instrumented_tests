package androidapp.model

import java.util.ArrayList

public class UserMap {
    internal var name: String? = null
    internal var email: String? = null
    internal var password: String? = null
    internal var document: String? = null
    internal var documentType: String? = null
    internal var country: String? = null
    internal var phone: String? = null
    internal var secondaryPhone: String? = null
    internal var secondaryEmail: String? = null
    var address: Address? = null
    var companyData: CompanyData? = null
    var equipments: ArrayList<Equipment>? = null
    var transactions: ArrayList<Transaction>? = null
}

public class Address {
    internal var state: String? = null
    internal var city: String? = null
    internal var district: String? = null
    internal var address: String? = null
    internal var number: String? = null
    internal var complement: String? = null
    internal var zip: String? = null
}

public class CompanyData {
    internal var contactName: String? = null
    internal var contactPhone: String? = null
    internal var contactEmail: String? = null
}

public class Equipment {
    internal var type: String? = null
    internal var purchaseDate: String? = null
    internal var serialNumber: String? = null
}

public class Transaction {
    internal var type: String? = null
    internal var series: String? = null
    internal var product: String? = null
    internal var date: String? = null
    internal var expiration: String? = null
    internal var serialNumber: String? = null
    internal var equipmentSerialNumber: String? = null
}
