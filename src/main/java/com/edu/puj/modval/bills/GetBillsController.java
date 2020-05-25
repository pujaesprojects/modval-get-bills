package com.edu.puj.modval.bills;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bills")
public class GetBillsController {

    @GetMapping("/{bill-id}")
    public ResponseEntity<Object> getBillPayment(@PathVariable(value = "bill-id") String billId) {
        return ResponseEntity.ok().body(billId);
    }

}
