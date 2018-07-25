#ParkingLot
###1.创建parkingBoy
* method:post
* path:"/parkingBoys"
* request:ParkingBoy
* response:ParkingBoy
```java
    @PostMapping("/parkingBoys")
    public ParkingBoy addParkingBoy(@RequestBody ParkingBoy newParkingBoy){
        return parkingBoyService.addParkingBoy(newParkingBoy);
    }
```

###2.创建parkingLot
* method:post
* path:"/parkingLots"
* request:ParkingLot
* response:ParkingLot
```java
    @PostMapping("/parkingLots")
    public ParkingLot addParkingLot(@RequestBody ParkingLot newParkingLot){
        return parkingLotService.addParkingLot(newParkingLot);
    }

```

###3.给ParkingBoy增加parkingLot
* method:put
* path:"/parkingLots/{pbid}"
* request:ParkingLot
* response:List < ParkingLot >
```java
    @PutMapping("/parkingBoys/{pbid}")
    public List<ParkingLot> addParkingLotToParkingBoyById(@PathVariable int pbid,@RequestBody ParkingLot parkingLot){
        return parkingBoyService.addParkingLotToParkingBoyById(pbid,parkingLot);
    }

```