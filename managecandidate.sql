create database ManageCandidate
go
use ManageCandidate
go
create table Experience(
	CandidateID varchar(10) primary key,
	FullName nvarchar(30),
	BirthDay date,
	Phone varchar(15),
	Email varchar(30),
	CandidateType int,
	ExpInYear int,
	ProSkill nvarchar(50)
)
insert into Experience values('Can1',N'Mai Văn Tú','03/30/1995','0977775487','tu@gmail.com','0','2','Java')
insert into Experience values('Can2',N'Mai Phước Quốc','03/30/1995','0977775487','tu@gmail.com','0','2','C#')
insert into Experience values('Can3',N'Nguyễn Hữu Tý','03/30/1995','0977775487','tu@gmail.com','0','2','. NET')
insert into Experience values('Can4',N'Hồng Dương','03/30/1995','0977775487','tu@gmail.com','0','2','FullStack')
update Experience set CandidateID = 'Can4', FullName = N'Khanh Nhi', BirthDay = '03/06/1996',Phone='0928182812',Email= 'nhi@gmail.com', CandidateType = '0',ExpInYear = '3', ProSkill= 'HTML'
where CandidateID = 'Can4'
select CandidateID, FullName, BirthDay, Phone, Email, CandidateType, ExpInYear, ProSkill
from Experience
select * from Experience